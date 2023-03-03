def main ( ) :
    import sys
    from string import ascii_letters
    sc = sys.stdin.read ( )
    s = sc.split ( '\n' )
    for i in range ( len ( s ) - 2 , 2 , - 2 ) :
        former = s [ : i // 2 ]
        latter = s [ i // 2 : i ]
        if former == latter :
            print ( len ( former ) + len ( latter ) )
            return

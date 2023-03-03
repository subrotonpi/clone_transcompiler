def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    s = sc.next ( )
    for i in range ( len ( s ) - 2 , 1 , - 2 ) :
        if s [ : i // 2 ] == s [ i // 2 : i ] :
            print ( i )
            break

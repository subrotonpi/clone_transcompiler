def main ( ) :
    import sys
    from string import printable
    sc = Scanner ( )
    s = sc.next ( )
    c = s [ 0 ]
    for i in range ( 1 , 4 ) :
        if s [ i ] != c :
            print ( "DIFFERENT" )
            return
    print ( "SAME" )

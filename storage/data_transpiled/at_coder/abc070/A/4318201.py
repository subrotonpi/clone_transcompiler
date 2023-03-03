def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    n = sc.next ( )
    for i in range ( len ( n ) / 2 ) :
        if n [ i ] != n [ len ( n ) - i - 1 ] :
            print ( "No" )
            sys.exit ( )
    print ( "Yes" )

def Main ( ) :
    global _scanner
    _scanner = _scanner
    n = _scanner.next ( )
    print ( n [ 0 ] - 49 + ( len ( n ) - 1 ) * 9 + ( n [ 1 : ].isdigit ( ) and 1 or 0 ) )

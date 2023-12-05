def Main ( ) :
    r , c , k , s = _raw_input ( ) , _raw_input ( ) , _raw_input ( ) , _raw_input ( ) , _raw_input ( )
    a = [ [ ] for i in range ( r ) ]
    _print ( _range ( r - 1 , c - k ) )
    for i in range ( r ) :
        a [ j ] [ i ] = 0 if s [ j ] [ i ] == 'x' else t + 1
    for j in range ( r ) :
        a [ j ] [ i ] = min ( a [ j - 1 ] [ i ] , s [ j - 1 ] [ i ] == 'x' )
    print ( _range ( k - 1 , r - k ) )
    for i in range ( c - k * 2 + 2 ) :
        for j in range ( k * 2 - 1 ) :
            for l in range ( k * 2 - 1 ) :
                if a [ i ] [ j + l ] >= min ( l + 1 , k * 2 - l - 1 ) :
                    break

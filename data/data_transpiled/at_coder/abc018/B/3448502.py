def main ( ) :
    import sys
    from string import ascii_lowercase
    from string import digits
    from string import digits
    from string import replace
    from string import digits
    from string import punctuation
    from string import replace
    from string import digits
    from string import punctuation
    from string import join
    S = digits ( )
    N = digits ( )
    operation = [ [ digits ( ) - 1 , digits ( ) - 1 ] for digits in digits ( ) ]
    for i in operation :
        S = replace_reverse ( S , i [ 0 ] , i [ 1 ] )
    print ( S )
    def replace_reverse ( s , l , r ) :
        s = [ s [ i ] for i in range ( l ) ]
        for i in range ( r , l - 1 , - 1 ) :
            s [ i ] = replace ( s [ i ] , s [ i + 1 ] )
        if r + 1 < len ( s ) :
            for i in range ( r + 1 , len ( s ) ) :
                s [ i ] = replace ( s [ i ] , s [ i + 1 ] )
        return ''.join ( s )
    return ''.join ( [ s [ 0 ] for s in replace ( s , ''.join ( [ i ] ) , ''.join ( [ i ] ) ) ] )

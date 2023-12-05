def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.random import seed
    N = randint ( 1 , N )
    A = [ randint ( 1 , N ) for _ in range ( N ) ]
    B = [ randint ( 1 , N ) for _ in range ( N ) ]
    map = zeros ( N )
    map [ N - 1 ] = A [ N - 1 ] % B [ N - 1 ] or 0
    map [ N - 1 ] = 0 if A [ N - 1 ] % B [ N - 1 ] == 0 else B [ N - 1 ] - ( A [ N - 1 ] % B [ N - 1 ] )
    for i in range ( N - 2 , 0 , - 1 ) :
        a = A [ i ]
        b = B [ i ]
        map [ i ] = ( A [ i ] + map [ i + 1 ] ) % B [ i ] or map [ i + 1 ] - ( A [ i ] + map [ i + 1 ] ) % B [ i ] + map [ i + 1 ]
    print ( map [ 0 ] )

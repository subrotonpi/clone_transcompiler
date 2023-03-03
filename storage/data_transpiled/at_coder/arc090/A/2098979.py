def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    A = [ [ randint ( 0 , N ) for i in range ( 2 ) ] for j in range ( N ) ]
    B = solve ( A )
    B [ 1 ] [ N - 1 ] = A [ 1 ] [ N - 1 ]
    B [ 0 ] [ N - 1 ] = A [ 0 ] [ N - 1 ] + A [ 1 ] [ N - 1 ]
    for j in range ( N - 2 , 0 , - 1 ) :
        B [ 1 ] [ j ] = A [ 1 ] [ j ] + B [ 1 ] [ j + 1 ]
        B [ 0 ] [ j ] = A [ 0 ] [ j ] + max ( B [ 0 ] [ j + 1 ] , B [ 1 ] [ j ] )
    print ( B [ 0 ] [ 0 ] )

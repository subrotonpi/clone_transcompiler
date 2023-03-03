def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N + 2 )
    A = [ randint ( 0 , N + 2 ) for _ in range ( N + 2 ) ]
    max = 0
    for i in range ( 1 , N + 1 ) :
        A [ i ] = randint ( 0 , N + 2 )
        max += abs ( A [ i ] - A [ i - 1 ] )
    max += abs ( A [ N ] )
    for k in range ( 1 , N + 1 ) :
        print ( max - abs ( A [ k ] - A [ k - 1 ] ) - abs ( A [ k + 1 ] - A [ k ] ) + abs ( A [ k + 1 ] - A [ k - 1 ] ) )

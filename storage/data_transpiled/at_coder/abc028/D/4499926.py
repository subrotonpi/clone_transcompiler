def main ( ) :
    import sys
    from numpy.linalg import norm
    from numpy.random import randint
    N = randint ( 1 , 10000 )
    K = randint ( 1 , 10000 )
    print ( ( ( K - 1 ) * ( N - K ) * 6 + ( N - 1 ) * 3 + 1 ) / float ( N ** 2 ) )

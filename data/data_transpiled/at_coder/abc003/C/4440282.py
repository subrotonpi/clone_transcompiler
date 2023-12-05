def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import uniform
    N = randint ( 1 , N )
    K = randint ( 1 , K )
    C = 0
    rate = [ solve ( i ) for i in range ( N ) ]
    rate = [ ( i + 1 ) for i in range ( N - K ) ]
    for i in range ( N - K , N ) :
        C = ( rate [ i ] + C ) / 2
    print ( C )

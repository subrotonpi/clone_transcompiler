def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    C = randint ( 1 , N )
    B = [ randint ( 1 , M ) for i in range ( M ) ]
    A = [ [ randint ( 1 , N ) for i in range ( N ) ] for j in range ( M ) ]
    sum = 0
    num = 0
    for i in range ( N ) :
        for j in range ( M ) :
            sum += A [ i ] [ j ] * B [ j ]
        if ( sum + C ) > 0 :
            num += 1
        sum = 0
    print ( num )

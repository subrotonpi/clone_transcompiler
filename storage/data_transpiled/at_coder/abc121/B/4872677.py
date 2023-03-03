def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    M = randint ( 1 , N )
    C = randint ( 1 , N )
    count = 0
    A = [ randint ( 1 , N ) for _ in range ( M ) ]
    B = [ randint ( 1 , N ) for _ in range ( M ) ]
    for i in range ( N ) :
        for j in range ( M ) :
            A [ j ] = randint ( 1 , N )
        sum = 0
        for k in range ( M ) :
            sum += A [ k ] * B [ k ]
        sum += C
        if sum > 0 :
            count += 1
    print ( count )
    solve ( )

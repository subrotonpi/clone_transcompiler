def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    C = randint ( 1 , N )
    res = 0
    B = solve ( M )
    A = solve ( M )
    for i in range ( N ) :
        sum = C
        for n in range ( M ) :
            A [ n ] = solve ( N )
        for n in range ( M ) :
            sum += A [ n ] * B [ n ]
        if sum > 0 :
            res += 1
    print ( res )

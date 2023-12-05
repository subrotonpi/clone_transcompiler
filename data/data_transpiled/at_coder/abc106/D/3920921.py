def main ( ) :
    import sys
    from itertools import count
    from random import randint
    from itertools import chain
    from itertools import chain
    N = randint ( 1 , N )
    M = randint ( 1 , N )
    Q = randint ( 1 , N )
    L = chain ( range ( M ) , range ( M ) )
    R = chain ( range ( M ) , range ( M ) )
    count = [ [ ] for _ in range ( N + 1 ) ]
    for i in range ( M ) :
        count [ L [ i ] [ R [ i ] ] ] += 1
    for i in range ( 1 , N + 1 ) :
        for j in range ( 0 , N ) :
            count [ i ] [ j ] = count [ i ] [ j ] + count [ i - 1 ] [ j ]
    for i in range ( 0 , N ) :
        for j in range ( 1 , N ) :
            count [ i ] [ j ] = count [ i ] [ j ] + count [ i ] [ j - 1 ]
    p = chain ( range ( Q ) , range ( Q ) )
    q = chain ( range ( Q ) , range ( Q ) )
    ans = count [ q [ i ] ] [ q [ i ] ] + count [ p [ i ] - 1 ] [ p [ i ] - 1 ] - count [ q [ i ] ] [ p [ i ] - 1 ] - count [ p [ i ] - 1 ] [ q [ i ] ]
    print ( ans )

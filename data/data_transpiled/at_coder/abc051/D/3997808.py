def main ( ) :
    import sys
    from random import randint
    from math import ceil
    from math import sin , cos , cos , log
    from math import log
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    edges = [ [ 0 ] * M for i in range ( M ) ]
    dist = [ [ 0 ] * N for i in range ( N ) ]
    INF = 100_000_000
    for i in range ( N ) :
        for j in range ( N ) :
            dist [ i ] [ j ] = INF
    for i in range ( M ) :
        a = randint ( - 1 , 1 )
        b = randint ( - 1 , 1 )
        c = randint ( - 1 , 1 )
        edges [ i ] [ 0 ] = a
        edges [ i ] [ 1 ] = b
        edges [ i ] [ 2 ] = c
        dist [ a ] [ b ] = dist [ b ] [ a ] = c
    for k in range ( N ) :
        for i in range ( N ) :
            for j in range ( N ) :
                if dist [ i ] [ j ] > dist [ i ] [ k ] + dist [ k ] [ j ] :
                    dist [ i ] [ j ] = dist [ i ] [ k ] + dist [ k ] [ j ]
        num = 0
        for a , b , c in edges :
            if dist [ a ] [ b ] == c :
                num += 1
        print ( M - num )

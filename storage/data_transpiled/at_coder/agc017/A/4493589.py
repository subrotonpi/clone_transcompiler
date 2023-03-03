def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from itertools import chain
    N = randint ( 1 , N )
    P = randint ( 1 , P )
    A = chain ( chain ( range ( N ) , range ( N ) ) , chain ( range ( N ) , range ( N ) ) )
    N = N * 100
    dp = [ [ 1 ] * ( N + 1 ) for i in range ( N + 1 ) ]
    dp [ 0 ] [ 0 ] = 1
    for i in range ( N ) :
        for j in range ( max ) :
            if dp [ i ] [ j ] != 0 :
                dp [ i + 1 ] [ j ] += dp [ i ] [ j ]
                k = j + A [ i ]
                dp [ i + 1 ] [ k ] += dp [ i ] [ j ]
    cnt = 0
    for i in range ( 0 , max ) :
        if i % 2 == P :
            cnt += dp [ N ] [ i ]
    print ( cnt )

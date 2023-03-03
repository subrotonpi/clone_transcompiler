def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from itertools import chain
    N = randint ( 1 , N )
    C = randint ( 1 , N )
    K = randint ( 1 , N )
    T = chain ( chain ( T , repeat ( N ) ) )
    T.sort ( )
    cnt = 1
    c = 1
    t = T [ 0 ] + K
    for i in range ( 1 , N ) :
        if c < C :
            if T [ i ] <= t :
                c += 1
            else :
                cnt += 1
                c = 1
                t = T [ i ] + K
        else :
            cnt += 1
            c = 1
            t = T [ i ] + K
    print ( cnt )

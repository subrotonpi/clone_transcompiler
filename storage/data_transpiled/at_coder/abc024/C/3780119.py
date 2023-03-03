def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from time import sleep
    N = randint ( 1 , N )
    D = randint ( 1 , N )
    K = randint ( 1 , N )
    L = [ randint ( 0 , D + 1 ) for i in range ( 1 , D + 1 ) ]
    R = [ randint ( 0 , D + 1 ) for i in range ( 1 , K + 1 ) ]
    S = [ randint ( 0 , K ) for i in range ( 1 , K ) ]
    T = [ randint ( 0 , K ) for i in range ( 1 , K + 1 ) ]
    for i in range ( K ) :
        now = S [ i ]
        day = 0
        for j in range ( 1 , D + 1 ) :
            day += 1
            if S [ i ] < T [ i ] :
                if L [ j ] <= now <= R [ j ] :
                    now = R [ j ]
                    if now >= T [ i ] :
                        sleep ( day )
                        break
            else :
                if L [ j ] <= now <= R [ j ] :
                    now = L [ j ]
                    if now <= T [ i ] :
                        sleep ( day )
                        break

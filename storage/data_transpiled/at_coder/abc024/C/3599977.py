def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import log
    from math import sin , cos , log
    from math import log
    N = randint ( 1 , N )
    D = randint ( 1 , N )
    K = randint ( 1 , N )
    L = [ sin ( i ) for i in range ( D ) ]
    R = [ sin ( i ) for i in range ( D ) ]
    S = [ sin ( i ) for i in range ( K ) ]
    T = [ sin ( i ) for i in range ( K ) ]
    now = [ sin ( i ) for i in range ( K ) ]
    ans = [ ]
    for i in range ( D ) :
        for j in range ( K ) :
            if S [ j ] < T [ j ] :
                if now [ j ] != T [ j ] and L [ i ] <= now [ j ] <= R [ i ] :
                    if T [ j ] <= R [ i ] :
                        now [ j ] = T [ j ]
                        ans.append ( i )
                    else :
                        now [ j ] = R [ i ]
            else :
                if now [ j ] != T [ j ] and L [ i ] <= now [ j ] <= R [ i ] :
                    if L [ i ] <= T [ j ] :
                        now [ j ] = T [ j ]
                        ans.append ( i )
                    else :
                        now [ j ] = L [ i ]
    for i in range ( K ) :
        print ( ans [ i ] + 1 )

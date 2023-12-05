def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import sin , cos , log
    N = randint ( 1 , N )
    F = [ [ sin ( i ) for i in range ( N ) ] for j in range ( 10 ) ]
    P = [ [ sin ( i ) for i in range ( N ) ] for j in range ( 11 ) ]
    ans = - 1000000000
    for i in range ( 1 , ( 1 << 10 ) ) :
        bene = 0
        for j in range ( N ) :
            cnt = 0
            for k in range ( 10 ) :
                if ( i >> k & 1 ) == 1 and F [ j ] [ k ] == 1 :
                    cnt += 1
            bene += P [ j ] [ cnt ]
        ans = max ( ans , bene )
    print ( ans )

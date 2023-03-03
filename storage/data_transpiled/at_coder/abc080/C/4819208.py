def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = randint ( 1 , 10 )
    f = [ [ log ( i ) for i in range ( n ) ] for j in range ( 10 ) ]
    p = [ [ log ( i ) for i in range ( n ) ] for j in range ( 11 ) ]
    ans = log ( 0 )
    for i in range ( 1 , 1 << 10 ) :
        c = [ 0 ] * n
        for j in range ( 10 ) :
            if ( i >> j & 1 ) == 1 :
                for k in range ( n ) :
                    if f [ k ] [ j ] == 1 :
                        c [ k ] += 1
        tmp = 0
        for l in range ( n ) :
            tmp += p [ l ] [ c [ l ] ]
        ans = max ( ans , tmp )
    print ( ans )

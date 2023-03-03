def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    from math import log
    from math import log
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    N = randint ( 1 , N )
    C = [ log ( x ) for x in range ( N ) ]
    C.sort ( )
    num = [ 0 ] * N
    for i in range ( N ) :
        for j in range ( i ) :
            if C [ i ] != C [ j ] and C [ i ] % C [ j ] == 0 :
                num [ i ] += 1
        for j in range ( N ) :
            if i != j and C [ i ] == C [ j ] :
                num [ i ] += 1
    ans = 0
    kosuu = 0
    for i in range ( N ) :
        kosuu = ( num [ i ] + 2 ) / 2
        ans += kosuu / ( num [ i ] + 1 )
    print ( ans )

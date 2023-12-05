def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import log
    from math import pi
    from math import log
    N = randint ( 1 , N )
    c = [ sin ( i ) for i in range ( N ) ]
    print ( "{0:.2f}".format ( N ) )
    ans = 0
    for i in range ( N ) :
        s = 0
        for j in range ( N ) :
            if c [ i ] % c [ j ] == 0 and i != j :
                s += 1
        if s % 2 == 0 :
            ans += ( s + 2.0 ) / ( 2 * s + 2.0 )
        else :
            ans += 0.5
    print ( ans )

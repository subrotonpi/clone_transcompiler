def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import sin , cos , log
    from math import log
    L = randint ( 1 , L )
    R = randint ( 1 , R )
    l = [ sin ( i ) for i in range ( L ) ]
    r = [ sin ( i ) for i in range ( R ) ]
    ans = 0
    for i in range ( L ) :
        for j in range ( R ) :
            if l [ i ] == r [ j ] :
                l [ i ] = r [ j ] = - 1
                ans += 1
                break
    print ( ans )

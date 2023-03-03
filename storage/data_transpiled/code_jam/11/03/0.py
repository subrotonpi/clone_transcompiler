def _import ( ) :
    import sys
    import random
    import math
    from math import sin , cos , exp
    from math import sin , cos , log
    from math import log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    T = int ( sys.stdin.readline ( ) )
    for zz in range ( 1 , T + 1 ) :
        N = int ( sys.stdin.readline ( ) )
        C = [ sin ( x ) for x in range ( N ) ]
        test = 0
        for c in C :
            test ^= c
        if test != 0 :
            print ( 'Case #%d: NO\n' % zz )
        else :
            min = sum ( c )
            sum = 0
            for c in C :
                sum += c
                min = min ( min , c )
            print ( 'Case #%d: %d\n' % ( zz , sum - min ) )

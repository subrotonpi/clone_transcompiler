def _import ( ) :
    import sys
    import math
    import numpy as np
    class B ( object ) :
        def p ( * x ) :
            sys.stderr.write ( " ".join ( map ( str , x ) ) + "\n" )
        def main ( self ) :
            with open ( "../data/" ) as infile :
                T = infile.read ( )
                for zz in range ( 1 , T + 1 ) :
                    N = len ( infile )
                    V = np.array ( infile )
                    ans = solve ( N , V )
                    print ( "Case #%d: %.09f\n" % ( zz , ans ) )
    def solve ( N , V ) :
        low = 0.0
        high = 1000000
        for i in range ( 100 ) :
            mid = ( low + high ) / 2
            if can ( mid , N , V ) :
                high = mid
            else :
                low = mid
        return low
    def can ( E , N , V ) :
        for i in range ( N ) :
            next :
                for j in range ( 2 ) :
                    y = V [ i ] + ( - E if j == 0 else E )
                    minslope = np.inf
                    maxslope = np.inf
                    for k in range ( N ) :
                        if k == i :
                            continue
                        for m in range ( 2 ) :
                            y2 = V [ k ] + ( - E if m == 0 else E )
                            slope = ( y2 - y ) / ( k - i )
                            if ( m == 0 and k < i ) or ( m == 1 and k > i ) :
                                if slope < maxslope :
                                    maxslope = slope
                                    if maxslope < minslope :
                                        continue next
                            else :
                                if slope > minslope :
                                    minslope = slope
                                    if maxslope < minslope :
                                        continue next
                    if minslope <= maxslope :
                        return True
        return False
    return B

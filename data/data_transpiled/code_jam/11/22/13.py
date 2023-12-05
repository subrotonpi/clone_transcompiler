def main ( arg ) :
    import os
    import os
    import os
    import math
    import os
    import math
    import os
    import os
    import math
    import os
    import math
    import os
    import os
    import os
    import os
    import os
    import string
    import math
    import os
    import os
    import os
    import os
    import subprocess
    import tempfile
    class GCJB ( ) :
        class Word ( object ) :
            def __init__ ( self , s ) :
                self.ind = 0
            def write ( self , filename , content ) :
                f = open ( filename , 'w' )
                f.write ( content )
                f.close ( )
        def solve ( ) :
            with open ( 'input/B-large.in' , 'r' ) as cin :
                T = cin.read ( )
                ans = ""
                for cas in range ( 1 , T + 1 ) :
                    c = cin.read ( )
                    d = cin.read ( )
                    p = [ ]
                    v = [ ]
                    sumV = 0
                    for i in range ( c ) :
                        p.append ( cin.read ( ) )
                        v.append ( cin.read ( ) )
                        sumV += v [ i ]
                    res = - 1
                    l = 0
                    r = d * sumV
                    print ( r )
                    while l <= r :
                        mid = ( l + r ) / 2
                        if ok ( mid ) :
                            res = mid
                            r = mid - 1
                        else :
                            l = mid + 1
                    if res and ok ( res - 0.5 ) :
                        res -= 0.5
                    ans += "Case #%d: %.2f\n" % ( cas , res )
                print ( ans )
                GCJB.write ( 'output/outputB.txt' , ans )
        def ok ( mid ) :
            p0 = p [ 0 ] - mid
            for i in range ( 1 , v [ 0 ] ) :
                pj = p0 + d
                if abs ( pj - p [ 0 ] ) > mid :
                    return False
                p0 = pj
            for i in range ( 1 , c ) :
                pj = p0 + d
                pl = p [ i ] - mid
                if not ok ( pj ) :
                
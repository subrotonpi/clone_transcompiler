def _import ( ) :
    import numpy as np
    import os
    import os
    import os
    import sys
    class B ( object ) :
        inf = 1000000000
        def __init__ ( self , tr , co , p ) :
            self.tr = tr
            self.co = co
            self.cache = [ ]
            for ar in self.cache :
                np.insert ( self.tr , ar )
        def sol ( self , i , k ) :
            if self.tr [ i ] <= k :
                return 0
            i1 , i2 = 2 * i , 2 * i + 1
            if i2 >= len ( self.tr ) :
                if self.tr [ i ] == k + 1 :
                    return self.co [ i ]
                return inf
            if self.cache [ i ] [ k ] != - 1 :
                return self.cache [ i ] [ k ]
            r1 = self.co [ i ] + sol ( i1 , k + 1 ) + sol ( i2 , k + 1 )
            r2 = sol ( i1 , k ) + sol ( i2 , k )
            r = min ( r1 , r2 )
            if r > inf :
                r = inf
            self.cache [ i ] [ k ] = r
            return r
    with open ( 'B-large.in' , 'r' ) as infile :
        with open ( 'b.out' , 'w' ) as outfile :
            T = np.arange ( 1 , T )
            for t in range ( 1 , T + 1 ) :
                p = np.arange ( 1 , T )
                n = 1 << p
                m = np.arange ( n )
                co = np.zeros ( n )
                for i in range ( p ) :
                    for j in range ( 1 << ( p - i - 1 ) ) :
                        co [ ( 1 << ( p - i - 1 ) ) + j ] = infile.read ( )
            tr = np.arange ( n )
            for i in range ( n - 1 , T + 1 ) :
                i1 , i2 = 2 * i , 2 * i + 1
                if i1 >= n :
                    return tr [ i ]

def _import ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import time
    import random
    import sys
    INF = 1000000000000L
    counts = [ ]
    n = int ( readword ( ) )
    for i in range ( tn ) :
        sys.stdout.write ( 'Case #%d: ' % ( i + 1 ) )
        solve ( )
    sys.stdout.flush ( )
    class b ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.stdout = sys.stdout
            self.INF = INF
            self.counts = counts
            self.n = n
            self.costs = costs
            self.best = [ ]
            self.best = [ ]
        def calc ( match , played ) :
            if match >= ( 1 << n ) :
                if played >= self.counts [ ( 1 << n ) - 1 - ( match - ( 1 << n ) ) ] :
                    return 0
                else :
                    return INF
            if self.best [ match ] [ played ] >= 0 :
                return self.best [ match ] [ played ]
            x1 = self.calc ( match * 2 + 1 , played ) + self.calc ( match * 2 , played )
            x2 = self.calc ( match * 2 + 1 , played + 1 ) + self.calc ( match * 2 , played + 1 ) + self.costs [ match ]
            self.best [ match ] [ played ] = min ( x1 , x2 )
            return self.best [ match ] [ played ]
        def solve ( self ) :
            n = int ( self.readword ( ) )
            self.counts = [ n - int ( c ) for c in self.counts ]
            self.costs = [ ]
            for i in range ( ( 1 << n ) - 1 ) :
                self.costs.append ( int ( self.readword ( ) ) )
            self.best = [ ]
            for i in range ( ( 1 << n ) ) :
                self.best.append ( - 1 )
            self.stdout.write ( '%s\n' % ( self.calc ( 1 , 0 ) ) )
    return b

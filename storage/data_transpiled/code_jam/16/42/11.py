def round2 ( ) :
    import os
    import sys
    import kattio
    import os
    import sys
    import numpy as np
    class B ( object ) :
        def __init__ ( self ) :
            self.io = kattio.open ( sys.argv [ 1 ] , 'rb' )
            self.io = open ( sys.argv [ 2 ] , 'wb' )
            self.io.write ( 'Case #%d: ' % i )
            B ( ).solve ( self.io )
    def evenprob ( p ) :
        k = len ( p ) // 2
        yes = np.zeros ( k + 1 )
        yes [ 0 ] = 1.0
        for i in range ( len ( p ) ) :
            oldyes = yes
            yes = np.zeros ( k + 1 )
            for j in range ( 0 , k ) :
                yes [ j ] = oldyes [ j ] * ( 1 - p [ i ] ) + ( oldyes [ j - 1 ] * p [ i ] if j > 0 else 0 )
        return yes [ k ]
    def solve ( self , io ) :
        N , K = io.size
        max = 0.0
        p = np.zeros ( N )
        best = None
        for i in range ( N ) :
            p [ i ] = io.float ( )
        p = np.array ( p )
        for left in range ( 0 , K ) :
            pselected = np.zeros ( K )
            pselected [ left ] = p [ left ]
            for i in range ( K - left ) :
                pselected [ left + i ] = p [ N - i - 1 ]
            v = evenprob ( pselected )
            if v > max :
                max = v
                best = pselected [ : , : ]
        io.write ( '%.10f' % max )
    return B ( ).solve ( )

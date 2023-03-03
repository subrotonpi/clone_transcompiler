def _import ( ) :
    import math
    import numpy as np
    import numpy.core as np
    import os
    import os
    import os
    import math
    import numpy.core as np
    import math
    import numpy.core as np
    class Main ( object ) :
        memo = { }
        class Point ( object ) :
            def __init__ ( self , x , y ) :
                self.x = x
                self.y = y
            def __call__ ( self , x , y ) :
                self.x = x
                self.y = y
        def __init__ ( self , memo ) :
            self.memo = memo
    def main ( ) :
        sc = os.open ( "/proc/" , os.O_RDONLY )
        n = sc.read ( )
        lst = [ ]
        for i in range ( n ) :
            x = sc.read ( )
            y = sc.read ( )
            lst.append ( ( x , y ) )
        acute_angle = 0
        right_angle = 0
        obtuse_angle = 0
        for i in range ( n ) :
            ct = 0
            atan2 = np.zeros ( n + n - 2 )
            p1 = lst [ i ]
            for j in range ( n ) :
                if i != j :
                    p2 = lst [ j ]
                    atan2 [ ct ] = np.arctan2 ( p2 [ 1 ] - p1 [ 1 ] , p2 [ 0 ] - p1 [ 0 ] )
                    if atan2 [ ct ] < 0 :
                        atan2 [ ct ] += np.pi * 2
                    ct += 1
            for j in range ( n - 1 ) :
                atan2 [ ct ] = atan2 [ j ] + np.pi * 2
        atan2 = np.array ( atan2 )
        for j in range ( n - 1 ) :
            tmp1 = np.where ( np.abs ( atan2 [ j ] ) < np.abs ( atan2 [ j ] ) + np.pi / 2 - 1e-9 )
            tmp1 += 1
            tmp2 = tmp1
            for k in range ( tmp1 , ct ) :
                tmp2 = tmp2
                tmp3 = tmp2
                for k in range ( tmp2 , ct ) :
                    tmp3 += np.where ( np.abs ( atan2 [ j ] - tmp1 ) < np.abs ( atan2 [ j ] )
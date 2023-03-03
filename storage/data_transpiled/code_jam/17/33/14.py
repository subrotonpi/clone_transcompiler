def gcj2017.r1c ( ) :
    import os
    import numpy as np
    import os
    import os
    import sys
    class Training ( object ) :
        def __init__ ( self ) :
            self.name = 'gcj2017/r1c/C-small-1'
            with open ( self.name + '.in' , 'r' ) as s :
                count = s.read ( )
    f = open ( self.name + '.out' , 'w' )
    for ii in range ( 1 , count + 1 ) :
        f.write ( 'Case #%d: ' % ii )
        n , k , u = numpy.random.randint ( 1 , n )
        p = numpy.random.rand ( n , k )
        res = solve ( n , k , u , p )
        f.write ( '%.8f' % res )
        f.write ( '\n' )
    f.close ( )
    def solve ( n , k , u , p ) :
        p = p [ : n ]
        while u > 0.000000001 :
            min = p [ 0 ]
            ni = n
            np = 1
            for i in range ( 1 , n ) :
                if p [ i ] == min :
                    continue
                np = p [ i ]
                ni = i
                break
            if ni * ( np - min ) <= u :
                for i in range ( ni ) :
                    p [ i ] = np
                u -= ni * ( np - min )
            else :
                d = u / ni
                for i in range ( ni ) :
                    p [ i ] += d
                u = 0
        res = 1
        for i in range ( n ) :
            res *= p [ i ]
        return res

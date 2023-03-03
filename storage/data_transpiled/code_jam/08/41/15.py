def _import ( ) :
    import math
    import numpy
    import numpy
    import numpy
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.core
    import numpy.random
    import sys
    class A :
        def __init__ ( self ) :
            self.A = A
        def __call__ ( self , * args ) :
            self.A = A
    INF = 1 << 29
    def run ( self ) :
        sc = numpy.random.randint ( 1 , 2 )
        on = sc.randint ( 1 , 2 )
        for o in range ( 1 , on + 1 ) :
            print ( "Case #%d: " % o , end = ' ' )
            m , v = sc.randint ( 1 , 2 )
            dp = [ ]
            g = [ ]
            can = [ ]
            for i in range ( ( m - 1 ) // 2 ) :
                g.append ( sc.randint ( 0 , 1 ) )
                can.append ( sc.randint ( 1 , 1 ) == 1 )
                dp.append ( [ 0 ] )
                dp.append ( [ 1 ] )
            for i in range ( ( m - 1 ) // 2 ) :
                a = sc.randint ( 0 , 1 )
                dp.append ( [ a ] )
                dp.append ( [ 1 - a ] )
            for i in range ( ( m - 1 ) // 2 - 1 ) :
                l , r = i * 2 + 1 , i * 2 + 2
                if g [ i ] == 0 :
                    for j in range ( 2 ) :
                        for k in range ( 2 ) :
                            dp [ i ] [ j | k ] = min ( dp [ i ] [ j | k ] , dp [ l ] [ j ] + dp [ r ] [ k ] )
                elif g [ i ] == 1 :
                    for j in range ( 2 ) :
                        for k in range ( 2 ) :
                            dp [ i ] [ j & k ] = min ( dp [ i ] [ j & k ] , dp [ l ] [ j
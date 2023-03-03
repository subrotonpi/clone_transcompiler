def _import ( ) :
    import sys
    import numpy as np
    import collections
    import math
    import numpy as np
    import math
    import numpy as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import random
    class A ( object ) :
        def __init__ ( self , * os ) :
            print ( self.__doc__ , file = sys.stderr )
    N = 10000
    dp = np.zeros ( N + 2 )
    def run ( self ) :
        with open ( "/dev/null" , "r" ) as sc :
            on = sc.read ( )
            for o in range ( 1 , on + 1 ) :
                print ( "Case #%d: " % o , file = sc )
                n = sc.read ( )
                g = np.zeros ( ( n , 3 ) )
                for i in range ( n ) :
                    for j in range ( 3 ) :
                        g [ i ] [ j ] = sc.read ( )
            max = 0
            for a in range ( 0 , N ) :
                fill ( dp , 0 )
                for i in range ( n ) :
                    if a >= g [ i ] [ 0 ] :
                        mb = N - a - g [ i ] [ 2 ]
                        if g [ i ] [ 1 ] <= mb :
                            dp [ g [ i ] [ 1 ] ] += 1
                            dp [ mb + 1 ] -= 1
                    sum = 0
                    for b in range ( 0 , N ) :
                        sum += dp [ b ]
                        if max < sum :
                            max = sum
                print ( max )
    def small_run ( self ) :
        with open ( "/dev/null" , "r" ) as sc :
            on = sc.read ( )
            for o in range ( 1 , on + 1 ) :
                print ( "Case #%d: " % o , file = sc )
                n = sc.read ( )
                g = np.zeros ( ( n , 3 ) )
                for i in range ( n ) :
                
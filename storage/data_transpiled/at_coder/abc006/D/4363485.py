def _import ( ) :
    import sys
    import numpy as np
    import numpy.random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = np.shape ( sc ) [ 0 ]
            c = np.random.rand ( N )
            LIS = np.zeros ( N )
            INTMAX = 100000
            LIS [ INTMAX ] = np.arange ( INTMAX )
            for numi in c :
                insertionPoint = bisect.bisect ( LIS , numi )
                LIS [ insertionPoint ] = min ( LIS [ insertionPoint ] , numi )
            maxSortedCount = bisect.bisect ( LIS , INTMAX - 1 )
            out ( N - maxSortedCount )
        def binary_search ( LTS , num ) :
            result = np.searchsorted ( LTS , num )
            return ( result >= 0 ) & ~ result
    return Main

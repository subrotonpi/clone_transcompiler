def _main ( ) :
    import math
    from numpy import pi
    from numpy.core import get_interval
    from numpy.linalg import get_diag
    from numpy.random import random
    N = int ( sys.stdin.read ( ) )
    x = [ random.randint ( 0 , N ) for i in range ( N ) ]
    y = [ random.randint ( 0 , N ) for i in range ( N ) ]
    count = [ 0 ] * 3
    eps = 1e-9
    for i in range ( N ) :
        tlist = [ ]
        for j in range ( N ) :
            if i == j :
                continue
            t = math.atan2 ( y [ j ] - y [ i ] , x [ j ] - x [ i ] )
            tlist.append ( t )
            tlist.append ( t + 2 * pi )
        tlist.sort ( )
        for j in range ( N - 1 ) :
            dt = tlist [ j ]
            k1 = upper_bound ( tlist , pi / 2 + dt - eps )
            k2 = lower_bound ( tlist , pi / 2 + dt + eps )
            k3 = upper_bound ( tlist , pi + dt - eps )
            count [ 1 ] += k2 - k1 - 1
            count [ 2 ] += k3 - k2 + 1
    count [ 0 ] = int ( N ) * ( N - 1 ) * ( N - 2 ) / 6 - count [ 1 ] - count [ 2 ]
    print ( "%d %d %d\n" % ( count [ 0 ] , count [ 1 ] , count [ 2 ] ) )

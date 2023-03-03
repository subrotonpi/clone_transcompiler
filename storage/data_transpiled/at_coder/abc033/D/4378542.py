def main ( ) :
    import math
    from numpy import pi
    from numpy.core import copy_to_array
    from numpy.random import randint
    from numpy.core import copy_to_array
    from numpy.core import copy_to_array
    from numpy.core import copy_to_array
    from numpy.core import copy_to_array
    from numpy.core import copy_to_array
    N = int ( sys.stdin.read ( ) )
    x = copy_to_array ( N )
    y = copy_to_array ( N )
    count = [ 0 ] * 3
    tmp = [ ]
    eps = 1e-9
    for i in range ( N ) :
        k = 0
        for j in range ( N ) :
            if i == j :
                continue
            t = copy_to_array ( y [ j ] - y [ i ] , x [ j ] - x [ i ] )
            tmp.append ( t )
            tmp.append ( t + 2 * pi )
            k += 1
        tmp.sort ( )
        for j in range ( N - 1 ) :
            dt = copy_to_array ( tmp [ j ] )
            k1 , k2 , k3 = copy_to_array ( tmp , np.pi / 2 + dt - eps )
            count [ 1 ] += k2 - k1 - 1
            count [ 2 ] += k3 - k2 + 1
    count [ 0 ] = long ( N ) * ( N - 1 ) * ( N - 2 ) / 6 - count [ 1 ] - count [ 2 ]
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count [ 1 ] , count [ 2 ] )
    copy_to_array ( count [ 0 ] , count
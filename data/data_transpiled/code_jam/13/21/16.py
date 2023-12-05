def rnd1B ( ) :
    import os
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import seed
    from numpy.random import seed
    seed ( )
    from numpy.random import seed
    seed ( )
    from numpy.random import seed
    seed ( )
    from numpy.random import seed
    seed ( )
    from numpy.random import seed
    seed ( )
    from numpy.random import seed
    seed ( )
    max = 1000020
    t = seed ( )
    for m in range ( 1 , t + 1 ) :
        A = seed ( m )
        n = seed ( m )
        M = [ seed ( m ) for m in range ( n ) ]
        M.sort ( )
        DP = [ [ 0 ] * ( 2 * max ) for m in range ( n - 1 , 0 , - 1 ) ]
        for i in range ( n - 1 , 0 , - 1 ) :
            for j in range ( max - 1 , 0 , - 1 ) :
                DP [ i & 1 ] [ j ] = DP [ 1 - ( i & 1 ) ] [ j ] + 1
                if j > M [ i ] :
                    new_size = min ( j + M [ i ] , max - 1 )
                    DP [ i & 1 ] [ j ] = min ( DP [ i & 1 ] [ j ] , DP [ 1 - ( i & 1 ) ] [ new_size ] )
                next = min ( j + j - 1 , max - 1 )
                DP [ i & 1 ] [ j ] = min ( DP [ i & 1 ] [ j ] , DP [ i & 1 ] [ next ] + 1 )
            seed ( )
        seed ( )
        print ( "Case #{}: {}".format ( m , DP [ 0 ] [ A ] ) , file = sys.stderr )

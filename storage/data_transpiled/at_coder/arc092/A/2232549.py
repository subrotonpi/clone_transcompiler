def main ( ) :
    import sys
    import os
    import numpy as np
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    N = len ( sys.argv )
    a = np.random.rand ( N , N )
    b = np.random.rand ( N , N )
    c = np.random.rand ( N , N )
    d = np.random.rand ( N , N )
    map1 = np.zeros ( ( 2 * N , 2 * N ) )
    map2 = np.zeros ( ( 2 * N , 2 * N ) )
    for i in range ( N ) :
        a [ i ] = np.random.rand ( N , N )
        b [ i ] = np.random.rand ( N , N )
        map1 [ a [ i ] , b [ i ] ] = True
    for i in range ( N ) :
        c [ i ] = np.random.rand ( N , N )
        d [ i ] = np.random.rand ( N , N )
        map2 [ c [ i ] , d [ i ] ] = True
    ans = 0
    for i in range ( 2 * N ) :
        out :
            for j in range ( 2 * N ) :
                if map2 [ i ] [ j ] :
                    for k in range ( j - 1 , - 1 , - 1 ) :
                        if map1 [ i ] [ k ] :
                            map1 [ i ] [ k ] = False
                            ans += 1
                            continue
            if i + 1 < 2 * N :
                for j in range ( 2 * N ) :
                    map1 [ i + 1 ] [ j ] |= map1 [ i ] [ j ]
        print ( ans )
    def tr ( * args ) :
        print ( np.sum ( args , axis = 1 ) )
    return tr

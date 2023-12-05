def main ( args ) :
    import random
    import math
    import numpy as np
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    t = random.randint ( 1 , 4 )
    for tt in range ( 1 , t + 1 ) :
        n = random.randint ( 1 , 4 )
        x , y , r = np.meshgrid ( x , y )
        ans = - 1
        if n == 1 :
            ans = r [ 0 ]
        elif n == 2 :
            ans = max ( r [ 0 ] , r [ 1 ] )
        elif n == 3 :
            ans = max ( r [ 0 ] , 0.5 * ( np.hypot ( x [ 2 ] - x [ 1 ] , y [ 2 ] - y [ 1 ] ) + r [ 1 ] + r [ 2 ] ) )
            ans = min ( ans , max ( r [ 1 ] , 0.5 * ( np.hypot ( x [ 2 ] - x [ 0 ] , y [ 2 ] - y [ 0 ] ) + r [ 0 ] + r [ 2 ] ) ) )
        assert_almost_equal ( x [ 0 ] , y [ 0 ] , ans )

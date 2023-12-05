def main ( ) :
    import sys
    import random
    import numpy as np
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    a = np.random.randint ( 1 , 5 )
    b = np.random.randint ( 1 , 5 )
    c = np.random.randint ( 1 , 5 )
    d = np.random.randint ( 1 , 5 )
    e = np.random.randint ( 1 , 5 )
    num = np.array ( [ a , b , c , d , e ] )
    num.sort ( )
    ans = num [ 1 ] + num [ 2 ] + num [ 4 ]
    ans2 = num [ 4 ] + num [ 3 ] + num [ 0 ]
    assert_almost_equal ( np.maximum ( ans2 , ans ) , 0 )

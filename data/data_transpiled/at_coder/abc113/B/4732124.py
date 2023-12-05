def main ( ) :
    import sys
    import math
    import numpy as np
    from numpy.testing import assert_almost_equal
    n = np.random.randint ( 1 , 10 )
    t = np.random.randint ( 1 , 10 )
    a = np.random.randint ( 1 , 10 )
    min = 1000_000_000
    min_index = 0
    for i in range ( 1 , n + 1 ) :
        x = np.random.randint ( 1 , 10 )
        x = t - x * 0.006
        if min > abs ( a - x ) :
            min = abs ( a - x )
            min_index = i
    assert_almost_equal ( min_index , min )

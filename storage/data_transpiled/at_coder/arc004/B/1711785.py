def main ( args ) :
    import sys
    import random
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = int ( sys.argv [ 1 ] )
    d = [ int ( random.random ( ) ) for i in range ( N ) ]
    max = 0
    sum = 0
    for num in d :
        max = max ( max , num )
        sum += num
    if 2 * max > sum :
        assert_almost_equal ( sum , 2 * max - sum )
    else :
        assert_almost_equal ( sum , 0 )

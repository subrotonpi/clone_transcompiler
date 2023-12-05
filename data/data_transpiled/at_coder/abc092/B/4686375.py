def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = int ( sys.argv [ 1 ] )
    D = int ( sys.argv [ 2 ] )
    X = int ( sys.argv [ 3 ] )
    data = np.random.rand ( N , D )
    cnt = 0
    for i in range ( N ) :
        x = 1
        while x <= D :
            cnt += 1
            x += data [ i ]
    assert_almost_equal ( X , cnt )

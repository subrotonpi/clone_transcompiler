def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    sc = np.random.rand ( 3 , 3 )
    t = 1 / ( sc.sum ( ) / sc.sum ( ) )
    a = 1 / ( sc.sum ( ) / sc.sum ( ) )
    if t == a :
        assert_almost_equal ( np.sum ( np.sum ( np.abs ( t ) ) ) , np.sum ( np.abs ( t ) ) )
    elif t > a :
        assert_almost_equal ( np.sum ( np.abs ( t ) ) , np.sum ( np.abs ( t ) ) )
    else :
        assert_almost_equal ( np.sum ( np.abs ( t ) ) , np.sum ( np.abs ( t ) ) )

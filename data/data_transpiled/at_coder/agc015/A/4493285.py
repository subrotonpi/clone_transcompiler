def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = int ( sys.argv [ 1 ] )
    A = int ( sys.argv [ 2 ] )
    B = int ( sys.argv [ 3 ] )
    sys.exit ( 0 )
    if N == 1 :
        if A != B :
            assert_almost_equal ( 0 , 1 )
        else :
            assert_almost_equal ( 1 , 2 )
        assert_almost_equal ( 0 , 0 )
    if B < A :
        assert_almost_equal ( 0 , 0 )
        assert_almost_equal ( 0 , 0 )
    min = A + B + A * ( N - 2 )
    max = A + B + B * ( N - 2 )
    assert_almost_equal ( max - min + 1 , min )

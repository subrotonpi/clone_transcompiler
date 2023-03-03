def main ( _ ) :
    import sys
    from numpy import arange
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    cases = int ( sys.argv [ 1 ] )
    freq = [ 0 ] * 1000
    for cc in range ( 1 , cases + 1 ) :
        p , k , l = divmod ( p , 1000 )
        for i in range ( l ) :
            freq [ i ] = np.random.randint ( 1 , k )
        freq [ : l ] = np.random.randint ( 1 , k )
        count = 0
        for i in range ( l - 1 , - 1 , - 1 ) :
            a = l - 1 - i
            count += freq [ i ] * ( a / k + 1 )
        assert_almost_equal ( np.random.randint ( 1 , k ) , count , decimal = 2 )
    assert_almost_equal ( np.random.randint ( 1 , k ) , count , decimal = 2 )

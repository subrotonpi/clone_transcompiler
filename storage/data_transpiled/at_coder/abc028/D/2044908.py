def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n = float ( sys.argv [ 1 ] )
    k = float ( sys.argv [ 2 ] )
    ans = 6.0 * ( k - 1 ) * ( n - k ) / n / n / n
    ans += 3.0 * ( n - 1 ) / n / n / n
    ans += 1.0 / n / n / n
    assert_almost_equal ( ans , 1.0 / n / n / n )

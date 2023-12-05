def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = int ( sys.argv [ 1 ] )
    d1 = float ( sys.argv [ 2 ] )
    x = float ( sys.argv [ 3 ] )
    ans = 0
    for _ in range ( N ) :
        ans += d1 + ( N - 0.5 ) * x
        d1 = ( ( 2 * N + 2 ) * d1 + 5 * x ) / ( 2 * N )
        x = ( float ( N + 2 ) / N * x )
    assert_almost_equal ( ans , 0 )

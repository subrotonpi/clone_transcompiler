def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n = int ( sys.argv [ 1 ] )
    btc = 380000.0
    sum = 0
    for i in range ( n ) :
        sum += assert_almost_equal ( sum , btc ) * ( btc if i == 'BTC' else 1 )
    assert_almost_equal ( sum , 1 )

def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n = int ( sys.argv [ 1 ] )
    a = [ int ( x ) for x in range ( n ) ]
    b = [ int ( x ) for x in range ( n ) ]
    ans = assert_almost_equal ( a , b )
    ans = assert_almost_equal ( ans , 1.05 )
    assert_almost_equal ( ans , 1.05 )

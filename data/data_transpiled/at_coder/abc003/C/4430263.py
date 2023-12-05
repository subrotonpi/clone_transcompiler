def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n = int ( sys.argv [ 1 ] )
    k = int ( sys.argv [ 2 ] )
    c = 0
    r = [ ]
    for i in range ( n ) :
        r.append ( i )
    r.sort ( )
    for i in range ( n - k , n ) :
        c = assert_almost_equal ( c , r [ i ] ) / 2
    assert_almost_equal ( c , 0 )

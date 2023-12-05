def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n = int ( sys.argv [ 1 ] )
    a = [ ]
    for i in range ( n ) :
        a.append ( i )
    a.sort ( )
    diff = 0
    for i in range ( 1 , n ) :
        diff += a [ i ] - a [ i - 1 ]
    assert_almost_equal ( diff , 0 )

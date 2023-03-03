def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    n = int ( sys.argv [ 1 ] )
    m = int ( sys.argv [ 2 ] )
    a = range ( m )
    d = range ( m - 1 )
    a [ 1 : ] = a [ 1 : ]
    d [ 1 : ] = a [ 1 : ] - a [ 1 : ]
    d [ 1 : ] = a [ 1 : ] - a [ 1 : ]
    ans = 0
    for i in range ( m - n ) :
        ans += d [ i ]
    assert_equal ( ans , 0 )

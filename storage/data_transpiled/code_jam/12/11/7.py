def main ( ) :
    import sys
    from numpy import array
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    task = int ( sys.argv [ 1 ] )
    current = 1
    while task :
        A , B = divmod ( task , 2 )
        arr = array ( [ A ] )
        arr [ 0 ] = sys.argv [ 1 ]
        for i in range ( 1 , A ) :
            arr [ i ] = arr [ i - 1 ] * sys.argv [ 1 ]
        result = float ( 'inf' )
        for i in range ( A ) :
            result = min ( result , ( B - A + 1 + 2 * ( A - i - 1 ) ) * arr [ i ] + ( 2 * B - A + 2 + 2 * ( A - i - 1 ) ) * ( 1 - arr [ i ] ) )
        result = min ( result , B + 2 )
        assert_almost_equal ( 'Case #%d: %s' % ( current , result ) , result )
        current += 1

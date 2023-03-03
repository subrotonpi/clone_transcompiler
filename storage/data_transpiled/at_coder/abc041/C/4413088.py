def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    n = len ( sys.argv )
    a = [ [ i , i ] for i in range ( n ) ]
    a.sort ( key = lambda x : y [ 1 ] - x [ 1 ] )
    for i in range ( n ) :
        assert_equal ( a [ i ] [ 0 ] + 1 , i )

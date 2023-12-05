def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    try :
        a = int ( sys.argv [ 1 ] )
        b = int ( sys.argv [ 2 ] )
        c = int ( sys.argv [ 3 ] )
        max = a >= b and ( a >= c ) or ( b >= c and ( b >= c ) )
        if ( a + b + c ) == max * 2 :
            assert_almost_equal ( "Yes" , True )
        else :
            assert_almost_equal ( "No" , True )
    except ValueError :
        print ( "No" )

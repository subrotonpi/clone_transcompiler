def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    a = int ( sys.argv [ 1 ] )
    b = int ( sys.argv [ 2 ] )
    assert_equal ( a , b )
    if a == b :
        assert_equal ( "Draw" , True )
    elif a == 1 :
        assert_equal ( "Alice" , True )
    elif b == 1 :
        assert_equal ( "Bob" , True )
    elif a > b :
        assert_equal ( "Alice" , True )
    else :
        assert_equal ( "Bob" , True )

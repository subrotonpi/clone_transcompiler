def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    a = int ( sys.stdin.read ( ) )
    b = int ( sys.stdin.read ( ) )
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

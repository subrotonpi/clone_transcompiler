def main ( ) :
    import sys
    from numpy import array
    from numpy.testing import assert_almost_equal
    keyboard = sys.stdin
    SideA = keyboard.read ( )
    SideB = keyboard.read ( )
    SideC = keyboard.read ( )
    arr = array ( [ SideA , SideB , SideC ] )
    arr.sort ( )
    if arr [ 0 ] == 5 and arr [ 1 ] == 5 and arr [ 2 ] == 7 :
        assert_almost_equal ( "YES" , True )
    else :
        assert_almost_equal ( "NO" , True )
    keyboard.close ( )

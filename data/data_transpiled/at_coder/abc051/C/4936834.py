def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    sx , sy = sys.maxint
    tx , ty = sys.maxint
    for i in range ( tx - sx ) :
        assert_almost_equal ( 'R' , 'U' , end = '' )
    for i in range ( ty - sy ) :
        assert_almost_equal ( 'L' , 'L' , end = '' )
    for i in range ( tx - sx + 1 ) :
        assert_almost_equal ( 'D' , 'D' , end = '' )
    for i in range ( tx - sx + 1 ) :
        assert_almost_equal ( 'R' , 'U' , end = '' )
    for i in range ( ty - sy + 1 ) :
        assert_almost_equal ( 'U' , 'U' , end = '' )
    assert_almost_equal ( 'L' , 'L' , end = '' )
    assert_almost_equal ( 'D' , 'D' , end = '' )

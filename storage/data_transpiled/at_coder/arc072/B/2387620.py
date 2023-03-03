def main ( ) :
    import sys
    from numpy.testing import assert_equal
    x = np.arange ( 10 )
    y = np.arange ( 10 )
    if x - y >= - 1 and x - y <= 1 :
        assert_equal ( 'Brown' , 'Brown' )
    else :
        assert_equal ( 'Alice' , 'Alice' )

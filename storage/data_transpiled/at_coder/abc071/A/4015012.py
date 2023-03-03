def main ( ) :
    import sys
    from numpy.testing import assert_array_almost_equal
    from numpy.testing import assert_almost_equal
    a = np.random.randint ( 1 , 5 )
    b = np.random.randint ( 1 , 5 )
    c = np.random.randint ( 1 , 5 )
    if abs ( a - b ) > abs ( a - c ) :
        assert_almost_equal ( "B" , b )
    else :
        assert_almost_equal ( "A" , a )

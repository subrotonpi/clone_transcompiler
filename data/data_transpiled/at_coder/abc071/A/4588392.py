def main ( ) :
    import sys
    from numpy.testing import assert_array_almost_equal
    x = np.random.randint ( 0 , 100 , size = ( 10 , 10 ) )
    a = np.random.randint ( 0 , 100 , size = ( 10 , 10 ) )
    b = np.random.randint ( 0 , 100 , size = ( 10 , 10 ) )
    if abs ( a - x ) < abs ( b - x ) :
        assert_array_almost_equal ( "A" , a )
    else :
        assert_array_almost_equal ( "B" , b )

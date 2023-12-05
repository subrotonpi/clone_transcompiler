def main ( ) :
    import sys
    from random import randint
    from numpy import array
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    a = array ( [ [ randint ( 1 , 4 ) for i in range ( 4 ) ] for j in range ( 4 ) ] )
    dx = [ 1 , 0 , 0 , - 1 ]
    dy = [ 0 , 1 , - 1 , 0 ]
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                nx = i + dx [ k ]
                ny = j + dy [ k ]
                if 0 <= nx < 4 and 0 <= ny < 4 and a [ i ] [ j ] == a [ nx ] [ ny ] :
                    assert_almost_equal ( assert_almost_equal ( assert_almost_equal ( np.array ( a [ i ] ) , np.array ( a [ j ] ) ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.array ( a [ k ] ) , np.array ( a [ k ] ) ) , assert_almost_equal ( np.
def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N , M , D = map ( int , range ( 0 , M ) )
    a = [ randint ( - 1 , 1 , N ) for i in range ( M ) ]
    a = [ randint ( - 1 , 1 , N ) for i in range ( M ) ]
    a = [ randint ( - 1 , 1 , N ) for i in range ( N ) ]
    once = [ i for i in range ( N ) ]
    for m in range ( M ) :
        t = once [ a [ m ] ]
        once [ a [ m ] ] = once [ a [ m ] + 1 ]
        once [ a [ m ] + 1 ] = t
    intervel = [ i for i in range ( N ) ]
    ans = [ i for i in range ( N ) ]
    for i in range ( D ) :
        if i % 2 == 1 :
            for j in range ( N ) :
                ans [ j ] = intervel [ ans [ j ] ]
            tmp = np.array ( intervel [ ans [ j ] ] )
            for j in range ( N ) :
                intervel [ j ] = tmp [ tmp [ j ] ]
        for i in range ( N ) :
            assert_almost_equal ( ans [ i ] , 1 )
    assert_almost_equal ( ans [ 0 ] , 1 )

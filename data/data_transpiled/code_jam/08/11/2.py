def test_minimum_scalar_product ( ) :
    import numpy as np
    from numpy.testing import assert_equal
    with open ( "test.txt" , "r" ) as sc :
        for c , T in enumerate ( sc.read ( ).splitlines ( ) ) :
            n = len ( sc.read ( ).splitlines ( ) )
            a1 , a2 = np.array ( sc.read ( ).splitlines ( ) ) , np.array ( sc.read ( ).splitlines ( ) )
            a1 = [ np.random.rand ( n ) * np.random.rand ( n ) for n in a1 ]
            a2 = [ np.random.rand ( n ) * np.random.rand ( n ) for n in a2 ]
            a1.sort ( )
            a2.sort ( )
            res = np.sum ( a1 * a2 )
            res = np.sum ( res )
            for i in range ( n ) :
                res += a1 [ i ] * a2 [ n - 1 - i ]
            print ( "Case #{}: {}".format ( c + 1 , res ) )

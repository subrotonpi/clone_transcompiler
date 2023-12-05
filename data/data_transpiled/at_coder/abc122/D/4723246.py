def main ( ) :
    import sys
    from numpy.linalg import norm
    from numpy.random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n = randint ( 1 , 5 )
    mod = 1_000_000_007
    dp = np.zeros ( ( 110 , 5 , 5 , 5 ) )
    dp [ 0 , 0 , 0 , 0 ] = 1
    for i in range ( n ) :
        for a in range ( 5 ) :
            for b in range ( 5 ) :
                for c in range ( 5 ) :
                    for d in range ( 1 , 4 ) :
                        if b == 1 and c == 3 and d == 2 :
                            continue
                        if a == 1 and c == 3 and d == 2 :
                            continue
                        if b == 3 and c == 1 and d == 2 :
                            continue
                        if b == 1 and c == 2 and d == 3 :
                            continue
                        if a == 1 and b == 3 and d == 2 :
                            continue
                        dp [ i + 1 ] [ b ] [ c ] [ d ] = ( dp [ i + 1 ] [ b ] [ c ] [ d ] + dp [ i ] [ a ] [ b ] [ c ] ) % mod )
    ans = 0
    for a in range ( 5 ) :
        for b in range ( 5 ) :
            for c in range ( 5 ) :
                ans = ( ans + dp [ n ] [ a ] [ b ] [ c ] ) % mod
        assert_almost_equal ( ans , 0 )

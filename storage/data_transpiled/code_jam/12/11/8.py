def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    inputs = np.random.randint ( 1 , 4 )
    Q :
        for _ in range ( 1 , inputs + 1 ) :
            a = np.random.randint ( 1 , 4 )
            b = np.random.randint ( 1 , 4 )
            exp = 2 + b
            prob = np.random.binomial ( a + 1 , b )
            exp2 = prob [ a ] * ( b - a + 1 ) + ( 1 - prob [ a ] ) * ( 2 * b - a + 2 )
            if exp2 < exp :
                exp = exp2
            exp2 = 0
            for i in range ( a ) :
                exp2 = prob [ i ] * ( 2 * ( a - i ) + ( b - a ) + 1 ) + ( 1 - prob [ i ] ) * ( ( 2 * ( a - i ) + ( b - a ) + 1 ) + b + 1 )
                if exp2 < exp :
                    exp = exp2
            assert_almost_equal ( np.log ( exp ) , exp , decimal = 3 )

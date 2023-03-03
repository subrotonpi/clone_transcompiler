def main ( ) :
    import math
    from numpy import sqrt
    from numpy.random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    T = randint ( 1 , T )
    for C in range ( 1 , T + 1 ) :
        print ( "Case #%d:\n" % C )
        D = float ( 'd' )
        N = randint ( 1 , T )
        A = randint ( 1 , T )
        if N == 1 :
            random.seed ( 1 )
            random.seed ( 1 )
            for a in range ( A ) :
                assert_almost_equal ( sqrt ( 2 * D / a ) , sqrt ( 2 * D / a ) )
            continue
        t1 = float ( 'd' )
        d1 = float ( 'd' )
        t2 = float ( 'd' )
        d2 = float ( 'd' )
        v = ( d2 - d1 ) / t2
        for a in range ( A ) :
            t_meet = ( v + sqrt ( v ** 2 + 2 * a * d1 ) ) / a
            d_meet = d1 + v * t_meet
            if d_meet >= D :
                assert_almost_equal ( sqrt ( 2 * D / a ) , sqrt ( 2 * D / a ) )
            else :
                assert_almost_equal ( t_meet , ( D - d_meet ) / v )

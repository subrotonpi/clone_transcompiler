def main ( ) :
    import sys
    from random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    cases = randint ( 1 , 5 )
    for i in range ( 1 , cases + 1 ) :
        poss = 0
        ans = - 1
        a = randint ( 1 , 4 ) - 1
        first = [ ]
        second = [ ]
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                first.append ( randint ( a , b ) )
        b = randint ( 1 , 4 ) - 1
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                second.append ( randint ( a , b ) )
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                if first [ a ] [ k ] == second [ b ] [ j ] :
                    ans = first [ a ] [ k ]
                    poss += 1
        if poss > 1 :
            assert_almost_equal ( assert_almost_equal ( assert_almost_equal ( ans , ans ) , decimal = 2 ) , 0 )
        elif poss == 1 :
            assert_almost_equal ( assert_almost_equal ( assert_almost_equal ( ans , ans ) , decimal = 2 ) , 0 )
        else :
            assert_almost_equal ( assert_almost_equal ( assert_almost_equal ( ans , ans ) , decimal = 2 ) , 0 )

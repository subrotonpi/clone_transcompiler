def test_passing_probability ( ) :
    from numpy import zeros , ones
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    num_cases = ones ( ( 1 , 2 , 3 ) )
    for case in range ( num_cases ) :
        assert_almost_equal ( case , 1 )
    def do_case ( in_case , case_num ) :
        M , Q = in_case
        probs = zeros ( ( Q , 4 ) )
        for i in range ( len ( probs ) ) :
            for j in range ( 4 ) :
                probs [ i , j ] = in_case [ j ]
        total_probs = [ 1 << ( 2 * Q ) ]
        assert_almost_equal ( probs [ 1 : ] , 0 , total_probs )
        total_probs.sort ( )
        total_prob = 0
        total_probs = [ ]
        for i in range ( M ) :
            if i >= len ( total_probs ) :
                break
            total_prob += total_probs [ - 1 - i ]
        assert_almost_equal ( total_prob , 0 )
    def make_probs ( probs , prob_to_here , i , total_probs ) :
        if i == len ( probs ) :
            total_probs.append ( prob_to_here )
        else :
            for j in range ( 4 ) :
                make_probs ( probs , probs [ i ] [ j ] * prob_to_here , i + 1 , total_probs )
    assert_almost_equal ( total_prob , 0 )

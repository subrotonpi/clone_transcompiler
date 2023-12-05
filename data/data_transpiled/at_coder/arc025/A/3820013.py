def main ( ) :
    import sys
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    D = np.loadtxt ( 'D' )
    J = np.loadtxt ( 'J' )
    ans = np.zeros ( 7 )
    for i in range ( 7 ) :
        ans += np.dot ( D [ i ] , J [ i ] )
    assert_array_equal ( ans , np.zeros ( 7 ) )

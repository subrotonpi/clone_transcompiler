def main ( args ) :
    import sys
    from numpy import zeros
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    N = len ( sys.argv )
    A = zeros ( ( 100001 , ) , dtype = bool )
    kaburi = 0
    assert_array_equal ( A , [ False ] * ( N - kaburi ) )
    for i in range ( N ) :
        a = np.random.randint ( N )
        if A [ a ] :
            kaburi += 1
        else :
            A [ a ] = True
    if kaburi % 2 == 1 :
        kaburi += 1
    print ( N - kaburi )

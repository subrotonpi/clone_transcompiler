def main ( ) :
    import sys
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    A = np.random.randint ( 1 , 100 )
    B = np.random.randint ( 1 , 100 )
    C = np.random.randint ( 1 , 100 )
    D = np.random.randint ( 1 , 100 )
    sum = 0
    if A < B :
        sum = sum + A
    else :
        sum = sum + B
    if C < D :
        sum = sum + C
    else :
        sum = sum + D
    assert_array_equal ( sum , A )

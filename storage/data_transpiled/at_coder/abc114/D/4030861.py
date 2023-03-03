def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    N = int ( sys.argv [ 1 ] )
    pr = [ False ] * ( N + 1 )
    count = 0
    for i in range ( 2 , N + 1 ) :
        pr [ i ] = True
    for i in range ( 2 , N + 1 ) :
        if pr [ i ] :
            count += 1
            for j in range ( 2 * i , N + 1 , i ) :
                pr [ j ] = False
    C = count
    prn = [ 0 ] * C
    id = 0
    for i in range ( N + 1 ) :
        if pr [ i ] :
            b = i
            while b <= N :
                prn [ id ] += N / b
                b *= i
            id += 1
    ans = 0
    for i in range ( C ) :
        for j in range ( C ) :
            for k in range ( j + 1 , C ) :
                if i != j and i != k and prn [ i ] >= 2 and prn [ j ] >= 4 and prn [ k ] >= 4 :
                    ans += 1
    for i in range ( C ) :
        for j in range ( C ) :
            if i != j and prn [ i ] >= 2 and prn [ j ] >= 24 :
                ans += 1
    for i in range ( C ) :
        for j in range ( C ) :
            if i != j and prn [ i ] >= 4 and prn [ j ] >= 14 :
                ans += 1
    if C > 0 and prn [ 0 ] >= 74 :
        ans += 1
    assert_equal ( ans , 0 )

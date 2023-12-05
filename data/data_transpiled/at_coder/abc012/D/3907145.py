def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n = randint ( 1 , n )
    m = randint ( 1 , m )
    a = [ randint ( 1 , n ) for _ in range ( m ) ]
    b = [ randint ( 1 , n ) for _ in range ( m ) ]
    t = [ randint ( 1 , n ) for _ in range ( m ) ]
    masu = [ [ n * 10000 + 10 for _ in range ( n + 1 ) ] for _ in range ( m ) ]
    for i in range ( n + 1 ) :
        for j in range ( n + 1 ) :
            masu [ i ] [ j ] = n * 10000 + 10
            if i == j :
                masu [ i ] [ j ] = 0
    for i in range ( m ) :
        masu [ a [ i ] ] [ b [ i ] ] = t [ i ]
        masu [ b [ i ] ] [ a [ i ] ] = t [ i ]
    masu [ 1 ] [ 1 ] = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , n + 1 ) :
            for k in range ( n + 1 ) :
                masu [ j ] [ k ] = min ( masu [ j ] [ k ] , masu [ j ] [ i ] + masu [ i ] [ k ] )
    ans = sum ( masu )
    tmpans = 0
    for i in range ( 1 , n + 1 ) :
        tmpans = 0
        for j in range ( 1 , n + 1 ) :
            if masu [ i ] [ j ] > tmpans :
                tmpans = masu [ i ] [ j ]
        if ans > tmpans :
            ans = tmpans
    assert_almost_equal ( ans , tmpans )

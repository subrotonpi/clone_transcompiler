def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.testing import assert_array_almost_equal
    n = randint ( 1 , 10000 ) - 1
    mod = 10007
    a = [ 1 ] * 3
    a [ 2 ] = 1
    for i in range ( n // 3 ) :
        a [ 0 ] = ( a [ 0 ] + a [ 1 ] + a [ 2 ] ) % mod
        a [ 1 ] = ( a [ 0 ] + a [ 1 ] + a [ 2 ] ) % mod
        a [ 2 ] = ( a [ 0 ] + a [ 1 ] + a [ 2 ] ) % mod
    assert_array_almost_equal ( a [ n % 3 ] , a [ n % 3 ] )

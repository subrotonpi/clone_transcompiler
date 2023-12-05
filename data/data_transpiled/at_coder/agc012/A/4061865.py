def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    sc = rand ( )
    N = sc.randint ( 1 , N )
    map = [ rand ( ) for i in range ( 3 * N ) ]
    map = [ rand ( ) for i in map ]
    ans = 0
    for i in range ( N ) :
        ans += map [ 3 * N - 2 - ( 2 * i ) ]
    print ( ans )

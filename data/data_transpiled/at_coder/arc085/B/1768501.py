def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    N = rand ( )
    Z = rand ( )
    W = rand ( )
    a = rand ( N )
    if N == 1 :
        print ( abs ( a [ 0 ] - W ) )
    else :
        print ( max ( abs ( a [ N - 1 ] - a [ N - 2 ] ) , abs ( a [ N - 1 ] - W ) ) )

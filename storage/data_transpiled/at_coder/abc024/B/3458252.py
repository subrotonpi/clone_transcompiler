def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    T = randint ( 1 , N )
    A = zeros ( N )
    ans = 0
    for i in range ( N ) :
        A [ i ] = solve ( N )
    for i in range ( N - 1 ) :
        if A [ i ] + T > A [ i + 1 ] :
            ans += A [ i + 1 ] - A [ i ]
        else :
            ans += T
    ans += T
    print ( ans )

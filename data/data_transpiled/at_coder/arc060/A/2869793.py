def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import seed
    from numpy.random import seed
    seed ( )
    N = randint ( 1 , N )
    A = randint ( 1 , N )
    X = range ( N )
    sum = 0
    for i in range ( N ) :
        X [ i ] = randint ( 1 , N )
        sum += X [ i ]
    dp = zeros ( ( N + 1 , N + 1 , sum + 1 ) )
    dp [ 0 ] [ 0 ] [ 0 ] = 1
    for j in range ( 1 , N + 1 ) :
        for k in range ( N + 1 ) :
            for s in range ( sum + 1 ) :
                if s < X [ j - 1 ] :
                    dp [ j ] [ k ] [ s ] = dp [ j - 1 ] [ k ] [ s ]
                elif k >= 1 and s >= X [ j - 1 ] :
                    dp [ j ] [ k ] [ s ] = dp [ j - 1 ] [ k ] [ s ] + dp [ j - 1 ] [ k - 1 ] [ s - X [ j - 1 ] ]
                else :
                    dp [ j ] [ k ] [ s ] = 0
    ans = 0
    for k in range ( 1 , N + 1 , k * A ) :
        ans += dp [ N ] [ k ] [ k * A ]
    print ( ans )

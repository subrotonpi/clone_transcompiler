def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import norm
    from numpy.random import randint
    N = randint ( 1 , N )
    D = randint ( 1 , D )
    X = randint ( 1 , X )
    Y = randint ( 1 , Y )
    ans = 0
    if X % D == 0 and Y % D == 0 :
        X /= D
        Y /= D
        dp = zeros ( ( 1001 , 1001 ) )
        for i in range ( 1001 ) :
            dp [ i , 0 ] = 1 / float ( randint ( 1 , i ) )
            dp [ i , i ] = 1 / float ( randint ( 1 , i ) )
            for j in range ( 1 , i ) :
                dp [ i , j ] = ( dp [ i - 1 , j - 1 ] + dp [ i - 1 , j ] ) / float ( 2 )
        for k in range ( 0 , N ) :
            prob1 = dp [ N , k ]
            if ( k + Y ) % 2 == 0 and ( N - k + X ) % 2 == 0 and ( k + Y ) >= 0 and ( k - Y ) >= 0 and ( N - k + X ) >= 0 and ( N - k - X ) >= 0 :
                up = ( k + Y ) / 2
                right = ( N - k + X ) / 2
                prob2 = dp [ k , up ]
                prob3 = dp [ N - k , right ]
                ans += norm ( prob1 * prob2 * prob3 )
    print ( ans )

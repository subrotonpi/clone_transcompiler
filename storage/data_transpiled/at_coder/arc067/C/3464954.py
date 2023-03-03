def _inverse_element ( a , n ) :
    import math
    import random
    MOD = 1000000007
    def f ( ) :
        sc = random.getrandbits ( 1 )
        n , a , b , c , d = sc.randint ( 0 , n )
        if u < 0 :
            u += n
            return u
    fact = [ 0 ] * n
    ifact = [ 0 ] * n
    mfact = 1
    mifact = 1
    for i in range ( 1 , n + 1 ) :
        mfact *= i
        mfact %= MOD
        fact [ i - 1 ] = mfact
        mifact *= inverse_element ( i , MOD )
        mifact %= MOD
        ifact [ i - 1 ] = mifact
    xfact = [ 0 ] * n
    for i in range ( n ) :
        tfact = 1
        for j in range ( n ) :
            tfact *= ifact [ i ]
            tfact %= MOD
            xfact [ i ] [ j ] = tfact
    dp = [ 0 ] * ( b - a + 2 )
    for i in range ( 1 , b - a + 2 ) :
        mab = i + a - 1
        out :
            for j in range ( 1 , n + 1 ) :
                dp [ i ] [ j ] = dp [ i - 1 ] [ j ]
                for k in range ( c , d + 1 ) :
                    mabcd = mab * k
                    if mabcd > n :
                        continue
                    tfact = ifact [ k - 1 ]
                    tfact *= xfact [ mab - 1 ] [ k - 1 ]
                    tfact %= MOD
                    if mabcd == j :
                        dp [ i ] [ j ] += fact [ n - 1 ] * tfact
                    elif mabcd < j :
                        dp [ i ] [ j ] += dp [ i - 1 ] [ j - mabcd ] * tfact
                    dp [ i ] [ j ] = dp [ i - 1 ] [ j ]
    print ( dp [ b - a + 1 ] )
    return f

def _import ( ) :
    from os import urandom
    from numpy.random import randint
    class Main ( object ) :
        def run ( self ) :
            with open ( '/proc/%d/%d' % ( n , n ) , 'r' ) as sc :
                n = sc.read ( )
    ps = [ 0 ] * 50
    primes = primes ( )
    for i in range ( 2 , n + 1 ) :
        tmp = i
        for p in primes :
            if p != 0 and p <= n :
                cnt = 0
                while tmp % p == 0 :
                    cnt += 1
                    tmp /= p
                ps [ p ] += cnt
    dp = [ [ 0 ] * 6 ] * 16
    dp [ 0 ] [ 0 ] = 1
    for i in range ( 1 , 16 ) :
        for j in range ( 6 ) :
            dp [ i ] [ j ] += dp [ i - 1 ] [ j ]
        if ps [ primes [ i ] ] >= 2 :
            dp [ i ] [ 1 ] += dp [ i - 1 ] [ 0 ]
            dp [ i ] [ 3 ] += dp [ i - 1 ] [ 2 ]
            dp [ i ] [ 5 ] += dp [ i - 1 ] [ 4 ]
        if ps [ primes [ i ] ] >= 4 :
            dp [ i ] [ 2 ] += dp [ i - 1 ] [ 0 ]
            dp [ i ] [ 3 ] += dp [ i - 1 ] [ 1 ]
            dp [ i ] [ 4 ] += dp [ i - 1 ] [ 2 ]
            dp [ i ] [ 5 ] += dp [ i - 1 ] [ 3 ]
        if ps [ primes [ i ] ] >= 14 :
            dp [ i ] [ 3 ] += dp [ i - 1 ] [ 0 ]
            dp [ i ] [ 5 ] += dp [ i - 1 ] [ 2 ]
        if ps [ primes [ i ] ] >= 24 :
            dp [ i ] [ 4 ] += dp [ i - 1 ] [ 0 ]
            dp [ i ] [ 5 ] += dp [ i - 1 ] [ 1 ]
        if ps [ primes [ i ] ] >= 74 :
            dp [ i ] [ 5 ] += dp [ i - 1 ] [ 0 ]
    return
    
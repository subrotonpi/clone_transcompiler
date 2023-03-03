def main ( ) :
    import sys
    from itertools import product
    from itertools import chain
    sc = sys.stdin
    n = len ( sys.argv )
    c = sc.randint ( 1 , n )
    a = [ sc.randint ( 1 , n ) for i in range ( n ) ]
    b = [ sc.randint ( 1 , n ) for i in range ( n ) ]
    mod = 1000000007
    table = [ [ ] for _ in range ( 1000 ) ]
    for i in range ( len ( table ) ) :
        sum = 0
        for j in range ( len ( table [ i ] ) ) :
            sum = ( sum + modpow ( j , i , mod ) ) % mod
            table [ i ].append ( sum )
    dp = [ [ 0 ] * ( n + 1 ) for i in range ( n ) ]
    for i in range ( n ) :
        if i == 0 :
            for j in range ( 0 , c ) :
                dp [ i ] [ j ] = ( table [ j ] [ b [ i ] ] - table [ j ] [ a [ i ] - 1 ] + mod ) % mod
        else :
            for j in range ( 0 , c ) :
                for k in range ( 0 , j ) :
                    dp [ i ] [ j ] += dp [ i - 1 ] [ j - k ] * ( table [ k ] [ b [ i ] ] - table [ k ] [ a [ i ] - 1 ] + mod ) % mod
                    dp [ i ] [ j ] %= mod
    print ( dp [ n - 1 ] [ c ] )
    def modpow ( a , b , mod ) :
        res = 1
        c = a
        while b > 0 :
            if b % 2 == 1 :
                res = ( res * c ) % mod
                c = ( c * c ) % mod
                b //= 2
        return res

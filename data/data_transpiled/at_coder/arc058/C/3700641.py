def main ( ) :
    import sys
    from math import pow
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    x , y , z = map ( int , sys.stdin.readline ( ).split ( ) )
    mod = 1000000007
    res = 0
    dp = [ [ 1 << 17 ] * ( 1 << 17 ) for i in range ( 1 , 10 ) ]
    for i in range ( 1 , n ) :
        for j in range ( 1 , 10 ) :
            for k in range ( 1 , 1 << 17 ) :
                bit = ( ( k << j ) + ( 1 << ( j - 1 ) ) ) % ( 1 << 17 )
                if ( ( bit & ( 1 << ( x - 1 ) ) ) > 0 ) and ( ( bit & ( 1 << ( ( x + y ) - 1 ) ) ) > 0 ) and ( ( bit & ( 1 << ( ( x + y + z ) - 1 ) ) ) > 0 ) :
                    continue
                dp [ i ] [ bit ] = ( dp [ i ] [ bit ] + dp [ i - 1 ] [ k ] ) % mod
    res = pow ( 10 , n , mod )
    for i in range ( 1 , 1 << 17 ) :
        res = ( res - dp [ n - 1 ] [ i ] + mod ) % mod
    pl ( res )
    def pl ( x ) :
        print ( x )
    def modpow ( a , b , mod ) :
        res = 1
        c = a
        while b > 0 :
            if b % 2 == 1 :
                res = ( res * c ) % mod
            c = ( c * c ) % mod
            b //= 2
        return res
    return pl ( )

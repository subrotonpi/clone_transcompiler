def import import _modpow
class Main ( object ) :
    def __init__ ( self ) :
        sc = _modpow.Scanner ( )
        n = sc.next ( )
        s = sc.next ( )
        m = len ( s )
        mod = 1000000007
        dp = [ 0 ] * ( m + n + 5 )
        ndp = [ 0 ] * ( m + n + 5 )
        for i in range ( 0 , n + 1 ) :
            if i == 0 :
                ndp [ 0 ] = 1
            else :
                ndp [ 0 ] = dp [ 0 ] + dp [ 1 ]
                for j in range ( 1 , m + n + 5 - i ) :
                    ndp [ j ] = dp [ j - 1 ] * 2 % mod + dp [ j + 1 ]
                    ndp [ j ] %= mod
            nndp = dp
            dp = ndp
            ndp = nndp
        print ( dp [ m ] * modpow ( inv ( 2 , mod ) , m , mod ) % mod )
    def modpow ( self , a , b , mod ) :
        res = 1
        c = a
        while b > 0 :
            if b % 2 == 1 :
                res , c = ( res * c ) % mod , ( c * c ) % mod
            b //= 2
        return res
    def inv ( self , a , mod ) :
        b = mod
        p , q = 1 , 0
        while b > 0 :
            c , d = a // b , a , b , d % b
            d , p , q = p , q , d - c * q
        return p + mod , q

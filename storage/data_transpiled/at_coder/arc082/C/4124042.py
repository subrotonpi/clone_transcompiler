def import import os , mod
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 998244353
    def __call__ ( self , * args ) :
        sc = open ( "/dev/null" , "r" )
        n = sc.read ( )
        x , y = [ sc.read ( ) for i in range ( n ) ]
        res = modPow ( 2 , n , mod ) - 1 - n
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                count = 0
                for k in range ( n ) :
                    if ( ( x [ i ] - x [ k ] ) * ( y [ j ] - y [ k ] ) == ( ( x [ j ] - x [ k ] ) * ( y [ i ] - y [ k ] ) ) ) :
                        count += 1
                kumi = modPow ( 2 , count , mod ) - 1 - count
                kumi = kumi * inv ( count * ( count - 1 ) / 2 , mod ) % mod
                res = ( res - kumi + mod ) % mod
        print ( res )
    def modPow ( a , b , mod ) :
        res = 1
        c = a
        while b > 0 :
            if b % 2 == 1 :
                res = res * c % mod
                c = c * c % mod
                b //= 2
        return res
    def inv ( a , mod ) :
        b = mod
        p , q = 1 , 0
        while b > 0 :
            c , d = a // b , a
            a , b , d = d % b , p , q
            p , q = d - c * q
        return ( mod + p ) % mod

def main ( ) :
    from math import ceil
    from random import randint
    from time import sleep
    sc = raw_input ( )
    n , a , b , k = map ( int , sc.split ( ) )
    mod = 998244353
    max = 300_003
    mn = Mod_nCr ( mod , max )
    ans = 0
    for red in range ( 0 , n ) :
        blue = int ( ( k - red * a ) / b )
        if red * a + blue * b == k and 0 <= blue :
            ans += mn.nCr ( n , red ) * mn.nCr ( n , blue )
            ans %= mod
    print ( ans )
    class Mod_nCr ( int ) :
        def __init__ ( self , mod , max ) :
            self.mod = mod
            self.fact = [ 1 ]
            self.rfact = [ 1 ]
            for i in range ( 1 , max ) :
                self.fact [ i ] = ( self.fact [ i - 1 ] * i ) % mod
                self.rfact [ i ] = self.mod_inverse ( self.fact [ i ] , mod )
        def mod_pow ( self , x , p , m ) :
            a = 1
            while p > 0 :
                if p % 2 == 1 :
                    a = a * x % m
                x = x ** m
                p //= 2
            return a
        def mod_inverse ( self , a , m ) :
            return self.mod_pow ( a , m - 2 , m )
        def nCr ( self , n , r ) :
            if n < r : return 0
            return self.fact [ n ] * self.rfact [ r ] % mod ** 2
    return Mod_nCr

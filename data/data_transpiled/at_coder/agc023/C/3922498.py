def import import _sys , sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        mod = 1000000007
        size = 1001000
        self.fact = [ 1 ] * size
        self.ifact = [ 0 ] * size
        self.fact [ 0 ] = 1
        for i in range ( 1 , size ) :
            self.fact [ i ] = self.fact [ i - 1 ] * i % mod
        self.ifact [ size - 1 ] = _inv ( self.fact [ size - 1 ] , mod )
        for i in range ( size - 1 , 0 , - 1 ) :
            self.ifact [ i - 1 ] = self.ifact [ i ] * i % mod
        res = 0
        sum = 0
        for i in range ( n // 2 , n ) :
            v = self.binom ( i - 1 , n - i - 1 , mod ) * self.fact [ i ] % mod * self.fact [ n - i - 1 ] % mod
            res = ( res + ( v - sum + mod ) % mod * i ) % mod
            sum = v
        print ( res )
    def binom ( a , b , mod ) :
        if a < b :
            return 0
        return self.fact [ a ] * self.ifact [ b ] % mod * self.ifact [ a - b ] % mod
    def inv ( a , mod ) :
        b = mod
        p , q = 1 , 0
        while b > 0 :
            c , d = a // b , a , b , d % b
            d , p , q = p , q , d - c * q
        return ( p + mod ) % mod

def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.MAX = 1000005
        self.MOD = 1000000007
    def fact ( self ) :
        self.fact = [ ]
        self.fact_inv = [ ]
        self.inv = [ ]
    def fact ( self ) :
        self.fact = [ ]
        self.inv_mod = [ ]
        ans = 0
        for i in range ( self.B , self.W ) :
            ans += combmod ( self.H - self.A - 1 + i , i ) * combmod ( self.W + self.A - i - 2 , A - 1 )
            ans %= self.MOD
        print ( ans )
    def fact ( self ) :
        self.fact [ 0 ] = 1
        for i in range ( 1 , MAX ) :
            self.fact [ i ] = self.fact [ i - 1 ] * i % self.MOD
    def inv_mod ( self ) :
        self.inv [ 0 ] = 1
        self.inv [ 1 ] = 1
        for i in range ( 2 , self.MAX ) :
            self.inv [ i ] = self.MOD - self.inv [ int ( self.MOD % i ) ] * ( self.MOD / i ) % self.MOD
    def fact_inv_mod ( self ) :
        self.fact [ 0 ] = 1
        for i in range ( 1 , self.MAX ) :
            self.fact [ i ] = self.fact_inv [ i - 1 ] * self.inv [ i ] % self.MOD
    def combmod ( self , n , k ) :
        if n < k :
            return 0
        if n < 0 or k < 0 :
            return 0
        return self.fact [ n ] * ( ( self.fact_inv [ k ] * self.fact_inv [ n - k ] ) % self.MOD ) % self.MOD

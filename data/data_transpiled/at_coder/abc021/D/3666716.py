def import _COMinit
class Main ( object ) :
    def __init__ ( self ) :
        self.max = 100002
        self.MOD = 1000000007
        self.fac = [ ]
        self.finv = [ ]
        self.inv = [ ]
    def main ( self ) :
        COMinit ( )
        with open ( self.path ) as sc :
            n = sc.read ( )
            k = sc.read ( )
            kotae = COM ( n , 1 ) * COM ( k - 1 , 0 )
            for i in range ( 2 , min ( n , k ) + 1 ) :
                kotae += COM ( n , i ) * COM ( k - 1 , i - 1 ) % MOD
                kotae %= MOD
            print ( kotae )
    def COMinit ( self ) :
        self.fac = fac [ 1 ] = 1
        self.finv = finv [ 1 ] = 1
        self.inv = 1
        for i in range ( 2 , max ) :
            self.fac [ i ] = self.fac [ i - 1 ] * i % MOD
            self.inv [ i ] = MOD - self.inv [ MOD % i ] * ( MOD / i ) % MOD
            self.finv [ i ] = self.finv [ i - 1 ] * self.inv [ i ] % MOD
    def COM ( self , n , k ) :
        if n < k : return 0
        if n < 0 or k < 0 : return 0
        return self.fac [ n ] * ( self.finv [ k ] * self.finv [ n - k ] % MOD ) % MOD

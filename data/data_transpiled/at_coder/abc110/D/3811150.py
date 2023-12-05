def _import ( ) : return fac [ n ] * finv [ k ] % MOD * finv [ n - k ] % MOD
class Main ( object ) :
    MAX_FAC = 510000
    MOD = 1000000007
    fac = [ ]
    finv = [ ]
    inv = [ ]
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        ans = 1
        self.init_comma_loop ( )
        m = M
        for i in range ( 2 , self.M + 1 ) :
            if m % i == 0 :
                count = 0
                while m % i == 0 :
                    m /= i
                    count += 1
                ans = ( ans * comb ( int ( N - 1 + count ) , count ) ) % MOD
        if m > 1 :
            ans = ( ans * N ) % MOD
        print ( ans )
    def init_comma_loop ( self ) :
        fac [ 0 ] = finv [ 0 ] = inv [ 0 ] = fac [ 1 ] = finv [ 1 ] = 1
        for i in range ( 2 , MAX_FAC ) :
            fac [ i ] = fac [ i - 1 ] * i % MOD
            inv [ i ] = MOD - ( MOD / i ) * inv [ int ( MOD % i ) ] % MOD
            finv [ i ] = finv [ i - 1 ] * inv [ i ] % MOD
    def comb ( self , n , k ) :
        return fac [ n ] * finv [ k ] % MOD * finv [ n - k ] % MOD

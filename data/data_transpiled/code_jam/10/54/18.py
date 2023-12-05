def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.k = 0
        def __init__ ( self , n , k ) :
            self.n = n
            self.k = k
        def __call__ ( self , r ) :
            if r.n != self.n :
                return int ( ( self.n - r.n ) / abs ( self.n - r.n ) )
        def main ( self ) :
            t = self.n
            for ca in range ( 1 , t + 1 ) :
                d = defaultdict ( lambda : int )
                n = self.n
                b = self.k
                ans = ( ans + f ( { n : i } ) ) % MOD
                for s in d.keys ( ) :
                    pass
                print ( "Case #{}: {}".format ( ca , ans ) )
    def f ( self ) :
        if self.n == 0 and self.k == 0 :
            return 1
        if self.n <= 0 or self.k <= 0 :
            return 0
        if self.s in d :
            return d [ self.s ]
        ans = 0
        for i in range ( 0 , self.k ) :
            for j in range ( int ( self.n % b ) , len ( nums [ b - 1 ] [ s.k ] ) , b ) :
                ans = ( ans + 1 * c [ s.k ] [ s.k - i ] * ( self.k - i ) % MOD * nums [ b - 1 ] [ s.k - 1 ] [ j ] % MOD * f ( { s.n - j } ) ) % MOD
        d [ self.s ] = int ( ans )
        return int ( ans )
nums = [ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ,
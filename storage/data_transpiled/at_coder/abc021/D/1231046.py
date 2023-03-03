def import _main
MOD = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1000000007
    def __call__ ( self , n , k ) :
        self.n = n
        self.k = k
        p1 = 1
        p2 = 1
        p3 = 1
        for i in range ( 1 , n + k - 1 ) :
            p1 = ( p1 * i ) % MOD
        for i in range ( 1 , k ) :
            p2 = ( p2 * i ) % MOD
        for i in range ( 1 , n - 1 ) :
            p3 = ( p3 * i ) % MOD
        p = ( p2 * p3 ) % MOD
        inv = func ( p , MOD - 2 )
        print ( ( p1 * inv ) % MOD )
    def func ( self , a , x ) :
        if not x :
            return 1
        if x % 2 == 0 :
            t = func ( self , a , x // 2 )
            return ( t * t ) % MOD
        t = func ( self , ( x - 1 ) // 2 )
        t = ( t * t ) % MOD
        return ( t * a ) % MOD

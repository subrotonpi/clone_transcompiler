def import _main
mod = 1000000000 + 7
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = mod
    def run ( self ) :
        sc = _main ( )
        n , k = [ int ( x ) for x in sc.split ( ) ]
        maxn = n + k - 1
        inv = [ 0 ] * maxn + [ 1 ]
        frac = [ 1 ] * maxn + [ 0 ]
        for i in range ( 1 , maxn + 1 ) :
            frac [ i ] = i * frac [ i - 1 ] % mod
        inv [ maxn ] = pow ( frac [ maxn ] , mod - 2 )
        for i in range ( maxn - 1 , 1 , - 1 ) :
            inv [ i ] = ( i + 1 ) * inv [ i + 1 ] % mod
        ans = frac [ maxn ] * inv [ k ] % mod * inv [ n - 1 ] % mod
        print ( ans )
    def pow ( self , base , p ) :
        ans = 1
        while p > 0 :
            if p % 2 == 1 :
                ans = ans * base % mod
            base = base ** mod
            p //= 2
        return ans

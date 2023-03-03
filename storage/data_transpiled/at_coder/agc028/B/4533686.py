def import import _sys
mod = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = mod
    def run ( self ) :
        sc = _sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        b = [ 0 ] + [ 0 ] + [ ( b [ i - 1 ] + pow ( i , mod - 2 ) ) % mod for i in range ( 1 , n + 1 ) ]
        ans = 0
        for i in range ( n ) :
            ans += a [ i ] * ( b [ i + 1 ] + b [ n - i ] - 1 )
            ans %= mod
        for i in range ( 1 , n + 1 ) :
            ans *= i
            ans %= mod
        print ( ans )
    def pow ( self , a , p ) :
        if not p :
            return 1
        elif p % 2 == 0 :
            d = pow ( a , p // 2 )
            return d ** 2 % mod
        else :
            return pow ( a , p - 1 ) * a % mod

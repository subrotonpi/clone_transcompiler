def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1_000_000_007
    def __call__ ( self ) :
        sc = _main ( )
        n = sc.eval ( )
        k = sc.eval ( )
        ans = ( ( k - 1 ) * ( n - k ) * 6 + ( n - 1 ) * 3 + 1 ) / n / n / n
        print ( ans )

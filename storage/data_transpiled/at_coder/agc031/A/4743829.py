def import _main
INF = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.INF = INF
    def __call__ ( self , s ) :
        sc = _main ( s )
        n , s = sc.split ( )
        d = { }
        for ch in s :
            if ch not in d :
                d [ ch ] = 0
            d [ ch ] = d [ ch ] + 1
        ans = 1
        for key in d :
            ans *= d [ key ] + 1
            ans %= INF
        ans -= 1
        print ( ans )

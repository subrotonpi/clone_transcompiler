def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        po = bin ( m )
        while len ( po ) < n :
            po = '0' + po
        p = po.split ( '' , 1 )
        ans = 0
        for i in range ( n ) :
            k = _main ( )
            ans += ( k if p [ n - 1 - i ] == '1' else 0 )
        print ( ans )

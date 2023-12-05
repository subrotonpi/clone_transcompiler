def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        x = [ _main ( self ) for _ in range ( self.m ) ]
        x.sort ( )
        dif = [ x [ i + 1 ] - x [ i ] for i in range ( self.m - 1 ) ]
        dif = [ dif [ i ] for i in range ( self.m - n ) ]
        ans = 0
        for i in range ( self.m - n ) :
            ans += dif [ i ]
        print ( ans )

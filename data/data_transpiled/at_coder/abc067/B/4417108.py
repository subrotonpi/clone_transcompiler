def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        po = [ _main ( self ) for _ in range ( self.n ) ]
        po.sort ( )
        ans = 0
        for i in range ( self.k ) :
            ans += po [ self.n - 1 - i ]
        print ( ans )

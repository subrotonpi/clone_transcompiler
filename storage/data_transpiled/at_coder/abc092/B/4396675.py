def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.d = int ( self.d )
        self.x = int ( self.x )
        po = _main ( self.n )
        ans = self.n
        self.d -= 1
        for i in range ( self.n ) :
            ans += self.d / po [ i ]
        print ( ans , x )

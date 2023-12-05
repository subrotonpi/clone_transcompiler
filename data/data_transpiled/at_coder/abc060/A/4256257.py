def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = _main ( )
        self.b = _main ( )
        self.c = _main ( )
        x = self.a [ - 1 ]
        y = self.b [ 0 ]
        z = self.b [ - 1 ]
        w = self.c [ 0 ]
        if x == y and z == w :
            print ( "YES" )
        else :
            print ( "NO" )

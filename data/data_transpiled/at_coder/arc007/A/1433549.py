def import _main
class Main ( object ) :
    def __init__ ( self , x ) :
        self.x = x
        self.s = _main ( self.x )
    def __repr__ ( self ) :
        return "%s(%s)" % ( self.x , self.s )

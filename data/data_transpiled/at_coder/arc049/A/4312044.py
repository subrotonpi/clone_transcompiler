def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = [ ]
        self.a , self.b , self.c , self.d = _main ( self.s )
        self.s.insert ( self.d , '\"' )
        self.s.insert ( self.c , '\"' )
        self.s.insert ( self.b , '\"' )
        self.s.insert ( self.a , '\"' )
        print ( self.s )

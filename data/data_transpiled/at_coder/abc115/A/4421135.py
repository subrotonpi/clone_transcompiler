def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = None
    def __call__ ( self , * args ) :
        sc = _main ( )
        self.N = sc.number
        self.s = "Christmas" if self.N == 25 else "Christmas Eve" if self.N == 24 else "Christmas Eve Eve"
        print ( self.s )

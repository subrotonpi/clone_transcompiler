def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def __call__ ( self , * args ) :
        h , w = self.sc.split ( )
        print ( ( h - 1 ) * w + h * ( w - 1 ) )

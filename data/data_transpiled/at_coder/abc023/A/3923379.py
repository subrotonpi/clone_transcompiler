def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.X = _main ( )
    def __call__ ( self , X ) :
        self.X = X
    tp = X / 10
    op = X % 10
    print ( tp + op )

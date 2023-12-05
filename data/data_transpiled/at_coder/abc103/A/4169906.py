def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def __call__ ( self ) :
        xs = [ x for x in _main ( ) ]
        xs.sort ( )
        print ( xs [ 2 ] - xs [ 0 ] )

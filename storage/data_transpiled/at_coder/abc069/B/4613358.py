def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        s = self.sc.value
        print ( s [ 0 ] + ( len ( s ) - 2 ) + s [ - 1 ] )

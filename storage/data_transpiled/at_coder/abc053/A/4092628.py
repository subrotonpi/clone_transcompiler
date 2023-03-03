def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        x = self.sc.__next__ ( )
        print ( 'ABC' if x < 1200 else 'ARC' )

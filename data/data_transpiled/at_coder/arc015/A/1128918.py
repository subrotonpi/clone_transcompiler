def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        self.n = sc.__next__ ( )
        print ( float ( 9 * self.n ) / 5 + 32.0f )

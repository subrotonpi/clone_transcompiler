def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        a = _main ( self.sc )
        b = _main ( self.sc )
        c = _main ( self.sc )
        print ( 'YES' if a [ - 1 ] == b [ 0 ] and b [ - 1 ] == c [ 0 ] else 'NO' )

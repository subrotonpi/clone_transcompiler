def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        s = self.sc.value
        print ( "YES" if s [ - 1 ] == 'T' else "NO" )

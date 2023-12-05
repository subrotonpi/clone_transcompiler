def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        s = self.sc.split ( )
        N = len ( s )
        print ( ( s [ 0 ] == s [ N - 1 ] ) ^ ( N % 2 == 0 ) and "Second" or "First" )

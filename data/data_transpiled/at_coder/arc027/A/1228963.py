def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
    def main ( self ) :
        limit = 18 * 60
        print ( limit - self.s.read ( ) * 60 - self.s.read ( ) )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.AB = sys.stdin.read ( )
        self.BC = sys.stdin.read ( )
        self.CA = sys.stdin.read ( )
        print ( ( AB * BC ) / 2 )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.scn = sys.stdin
        self.N = self.scn.count ( )
        self.i = self.scn.index ( )
        print ( self.N - self.i + 1 )

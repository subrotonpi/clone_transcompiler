def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.n = self.sc.__next__ ( )
        print ( 5000 * ( self.n + 1 ) )

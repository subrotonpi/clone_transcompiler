def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.length = sys.stdin.read ( )
        self.white = sys.stdin.read ( )
        self.square = self.length ** 2
        print ( self.square - self.white )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        print ( self.n ** 2 - self.a )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.t = sys.stdin.read ( )
        print ( ( x - t ) if x > t else 0 )

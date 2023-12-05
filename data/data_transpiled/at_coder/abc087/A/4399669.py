def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        print ( self.x - ( self.a + ( self.x - self.a ) / self.b ** 2 ) )

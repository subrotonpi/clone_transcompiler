def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.h = sys.stdin.read ( )
        self.line = self.a + self.b
        self.area = self.line * self.h / 2
        print ( self.area )

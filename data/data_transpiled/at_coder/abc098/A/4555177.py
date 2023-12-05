def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.max = max ( self.a + self.b , self.a - self.b )
        self.max = max ( self.max , self.a * self.b )
        print ( self.max )

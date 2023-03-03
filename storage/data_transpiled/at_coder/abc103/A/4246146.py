def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a1 = sys.stdin.read ( )
        self.a2 = sys.stdin.read ( )
        self.a3 = sys.stdin.read ( )
        self.b1 = int ( abs ( self.a1 - self.a2 ) )
        self.b2 = int ( abs ( self.a3 - self.a2 ) )
        self.b3 = int ( abs ( self.a1 - self.a3 ) )
        self.max = max ( self.b1 , self.max ( self.b2 , self.b3 ) )
        print ( self.b1 + self.b2 + self.b3 - self.max )

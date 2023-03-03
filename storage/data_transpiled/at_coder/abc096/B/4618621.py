def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        self.max = max ( self.a , max ( self.b , self.c ) )
        for i in range ( self.k ) :
            self.max *= 2
        self.sum = self.a + self.b + self.c + self.max - max ( self.a , self.b , self.c )
        print ( self.sum )

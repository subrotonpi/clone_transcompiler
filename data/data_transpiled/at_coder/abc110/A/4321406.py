def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        if self.a >= self.b and self.a >= self.c :
            print ( self.a * 10 + self.b + self.c )
        elif self.b >= self.a and self.b >= self.c :
            print ( self.b * 10 + self.a + self.c )
        elif self.c >= self.b and self.c >= self.a :
            print ( self.c * 10 + self.b + self.a )

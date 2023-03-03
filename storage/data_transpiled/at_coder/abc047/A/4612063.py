def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        if self.a + self.b == self.c or self.b + self.c == self.a or self.a + self.c == self.b :
            print ( "Yes" )
        else :
            print ( "No" )

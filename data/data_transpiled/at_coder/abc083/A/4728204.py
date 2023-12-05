def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        if self.a + self.b > self.c + self.d :
            print ( "Left" )
        elif self.a + self.b < self.c + self.d :
            print ( "Right" )
        else :
            print ( "Balanced" )

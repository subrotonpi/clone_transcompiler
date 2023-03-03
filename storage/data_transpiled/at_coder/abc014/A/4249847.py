def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = 0
        if self.a % self.b != 0 :
            self.c = self.b - ( self.a % self.b )
            print ( self.c )
        else :
            print ( 0 )

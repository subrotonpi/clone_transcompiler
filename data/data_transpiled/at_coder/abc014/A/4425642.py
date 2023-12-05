def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        if self.a % self.b == 0 :
            print ( 0 )
        else :
            print ( self.b - self.a % self.b )

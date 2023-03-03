def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.W = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        if self.b - self.W - self.a > 0 :
            print ( self.b - self.W - self.a )
        elif self.a - self.b - self.W > 0 :
            print ( self.a - self.b - self.W )
        else :
            print ( 0 )

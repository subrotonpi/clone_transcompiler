def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        if self.a > self.b :
            print ( self.a - 1 )
        else :
            print ( self.a )

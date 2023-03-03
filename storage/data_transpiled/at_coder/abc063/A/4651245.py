def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        if self.a + self.b >= 10 :
            print ( 'error' )
        else :
            print ( self.a + self.b )

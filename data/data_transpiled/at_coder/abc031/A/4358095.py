def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        print ( ( a > b ) * ( b + 1 ) if a > b else ( a + 1 ) * b )

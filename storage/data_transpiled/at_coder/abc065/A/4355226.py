def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        print ( ( "delicious" if self.x + a >= self.b else "safe" if self.a >= self.b else "dangerous" ) )

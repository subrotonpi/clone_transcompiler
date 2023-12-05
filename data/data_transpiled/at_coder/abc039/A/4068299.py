def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.s = ( self.a * self.c ) + ( self.a * self.b ) + ( self.b * self.c )
        sys.stdout.write ( self.s * 2 )

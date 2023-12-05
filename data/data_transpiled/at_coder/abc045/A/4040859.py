def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.h = sys.stdin.read ( )
        self.sq = ( self.a + self.b ) * self.h
        sys.stdout.write ( self.sq / 2 )

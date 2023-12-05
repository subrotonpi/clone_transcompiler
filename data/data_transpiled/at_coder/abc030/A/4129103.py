def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
    def run ( self ) :
        self.a = int ( self.a )
        self.b = int ( self.b )
        self.c = int ( self.c )
        self.d = int ( self.d )
        self.ta = ( self.b * 100 ) / self.a
        self.ao = ( self.d * 100 ) / self.c
        if self.ta > self.ao :
            print ( "TAKAHASHI" )
        elif self.ao > self.ta :
            print ( "AOKI" )
        elif self.ta == self.ao :
            print ( "DRAW" )

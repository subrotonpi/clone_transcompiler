def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        if ( self.a + self.b == self.c ) and ( self.a - self.b == self.c ) :
            print ( "?" )
        elif self.a + self.b == self.c :
            print ( "+" )
        elif self.a - self.b == self.c :
            print ( "-" )
        else :
            print ( "!" )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.a = int ( sys.stdin.readline ( ) )
        self.b = int ( sys.stdin.readline ( ) )
        self.print ( "Alice" if ( self.a - self.b ) % 2 == 0 else "Borys" )

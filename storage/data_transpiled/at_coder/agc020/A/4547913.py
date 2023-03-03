def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.a = int ( sys.stdin.read ( ) )
        self.b = int ( sys.stdin.read ( ) )
        if ( self.b - self.a ) % 2 == 0 :
            print ( "Alice" )
        else :
            print ( "Borys" )

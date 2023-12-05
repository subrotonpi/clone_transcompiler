def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        print ( ( b % a == 0 ) / a if ( b % a == 0 ) else b / a + 1 )

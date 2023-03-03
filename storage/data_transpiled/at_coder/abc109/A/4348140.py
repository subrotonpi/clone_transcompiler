def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        print ( ( 'Yes' if ( ( ( a * b ) % 2 ) == 1 ) else 'No' ) )

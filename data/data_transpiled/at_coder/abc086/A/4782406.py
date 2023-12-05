def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.s = ( 'Even' if ( self.a * self.b ) % 2 == 0 else 'Odd' )

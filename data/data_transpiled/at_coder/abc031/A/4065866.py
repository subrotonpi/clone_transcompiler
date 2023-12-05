def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        print ( max ( ( a + 1 ) * b , a * ( b + 1 ) ) )

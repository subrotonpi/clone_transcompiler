def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = int ( self.sc.readline ( ) )
        b = int ( self.sc.readline ( ) )
        h = int ( self.sc.readline ( ) )
        print ( ( a + b ) * h / 2 )

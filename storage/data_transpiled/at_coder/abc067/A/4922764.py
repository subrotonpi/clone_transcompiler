def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        if self.a % 3 == 0 or self.b % 3 == 0 or ( self.a + self.b ) % 3 == 0 :
            print ( "Possible" )
        else :
            print ( "Impossible" )

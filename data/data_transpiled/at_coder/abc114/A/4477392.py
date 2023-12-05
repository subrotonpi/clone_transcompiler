def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.X = sys.stdin.read ( )
        if self.X == 7 or self.X == 5 | self.X == 3 :
            print ( "YES" )
        else :
            print ( "NO" )

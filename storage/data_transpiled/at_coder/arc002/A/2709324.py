def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Y = sys.maxint
        if ( self.Y % 4 == 0 and self.Y % 100 != 0 ) or self.Y % 400 == 0 :
            self.print ( "YES" )
        else :
            self.print ( "NO" )

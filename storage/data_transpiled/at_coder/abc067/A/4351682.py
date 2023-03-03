def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner ( )
        a = self.Scanner ( )
        b = self.Scanner ( )
        print ( "Possible" if ( ( a + b ) % 3 == 0 or a % 3 == 0 or b % 3 == 0 ) else "Impossible" )

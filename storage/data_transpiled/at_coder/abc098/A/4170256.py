def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.read ( )
        b = self.sc.read ( )
        max = sys.maxint
        if ( a + b ) > max :
            max = a + b
        if ( a - b ) > max :
            max = a - b
        if ( a * b ) > max :
            max = a * b
        print ( max )

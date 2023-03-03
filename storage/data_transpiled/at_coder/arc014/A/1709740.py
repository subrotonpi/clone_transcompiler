def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.__next__ ( )
        if self.N % 2 == 1 :
            print ( "Red" )
        elif self.N % 2 == 0 :
            print ( "Blue" )

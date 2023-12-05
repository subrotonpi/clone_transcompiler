def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
        self.n = int ( self.raw_input )
        if self.n % 2 == 0 :
            print ( "Blue" )
        else :
            print ( "Red" )

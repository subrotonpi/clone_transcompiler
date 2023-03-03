def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
        self.n = len ( self.input )
        if self.n % 3 == 0 :
            self.print ( "YES" )
        else :
            self.print ( "NO" )

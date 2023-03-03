def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __call__ ( self ) :
        y = self.raw_input ( )
        if y % 400 == 0 or ( y % 100 != 0 and y % 4 == 0 ) :
            print ( "YES" )
        else :
            print ( "NO" )

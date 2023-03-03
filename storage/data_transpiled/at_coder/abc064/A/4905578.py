def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __call__ ( self ) :
        r = int ( self.raw_input )
        g = int ( self.raw_input )
        b = int ( self.raw_input )
        sum = r * 100 + g * 10 + b
        if sum % 4 == 0 :
            print ( "YES" )
        else :
            print ( "NO" )

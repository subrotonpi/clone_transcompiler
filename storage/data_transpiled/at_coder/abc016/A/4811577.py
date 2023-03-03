def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input ( )
    def __call__ ( self ) :
        print ( self.raw_input % self.raw_input or 'YES' )

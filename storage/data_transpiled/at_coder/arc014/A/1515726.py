def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input ( )
    def __call__ ( self ) :
        print ( 'Red' if self.raw_input % 2 == 1 else 'Blue' )

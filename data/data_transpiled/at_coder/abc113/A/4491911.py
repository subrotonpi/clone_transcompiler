def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        X = self.input.read ( )
        Y = self.input.read ( )
        print ( X + Y / 2 , end = ' ' )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.index ( 'N' )
    def run ( self ) :
        self.output = ( self.N * ( self.N + 1 ) ) / 2
        print ( self.output )

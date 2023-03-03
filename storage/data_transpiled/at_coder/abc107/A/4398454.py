def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.i = sys.argv.index ( 'i' )
        print ( self.n - self.i + 1 )

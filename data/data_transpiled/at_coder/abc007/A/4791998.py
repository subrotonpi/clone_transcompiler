def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( '--' )
        self.interval = sys.argv.pop ( '--' )
    def run ( self ) :
        self.interval = sys.argv.pop ( '--' )
        print ( self.interval )

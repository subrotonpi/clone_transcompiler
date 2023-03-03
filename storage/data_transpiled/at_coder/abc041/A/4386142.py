def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.i = sys.argv.index ( '.' )
        print ( self.s [ - 1 : ] )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.tmp = sys.argv [ 0 ] + sys.argv [ 1 ]
        print ( self.tmp if self.tmp < 10 else 'error' )

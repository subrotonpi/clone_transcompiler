def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
        print ( T - S + 1 )

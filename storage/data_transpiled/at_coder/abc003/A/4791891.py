def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        w = self.sc.__next__ ( )
        w = ( w * 10000 + 10000 ) / 2
        print ( w )

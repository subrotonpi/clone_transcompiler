def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = sys.stdin.read ( )
        print ( x / 10 + x % 10 )

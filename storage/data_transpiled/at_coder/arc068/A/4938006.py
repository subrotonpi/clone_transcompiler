def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = sys.stdin.read ( )
        print ( x / 11 * 2 + ( x % 11 > 6 and 2 or ( x % 11 == 0 and 0 or 1 ) ) )

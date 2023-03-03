def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.n = sc.__next__ ( )
        print ( ( 800 * self.n ) - ( self.n / 15 * 200 ) )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        n = self.sc.read ( )
        print ( ( n + 1 ) * n / 2 )

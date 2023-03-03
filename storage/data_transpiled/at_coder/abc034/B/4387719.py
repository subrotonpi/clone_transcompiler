def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.n = self.sc.__next__ ( )
        print ( ( n % 2 == 0 ) and n - 1 or n + 1 )

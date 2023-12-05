def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.n = self.sc.__next__ ( )
        if self.n % 2 == 0 :
            print ( self.n - 1 )
            return
        print ( self.n + 1 )

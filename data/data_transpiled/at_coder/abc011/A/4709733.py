def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        N = self.sc.count ( )
        if N == 12 :
            self.print ( 1 )
        else :
            self.print ( N + 1 )

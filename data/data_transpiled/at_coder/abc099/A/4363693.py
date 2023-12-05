def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        N = self.sc.readline ( )
        print ( 'ABC' if N < 1000 else 'ABD' )

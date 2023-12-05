def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        n = self.sc.readline ( )
        print ( 'ABC' if n < 1000 else 'ABD' )

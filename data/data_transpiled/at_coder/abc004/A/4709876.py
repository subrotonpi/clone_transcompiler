def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        N = self.sc.recv ( 1024 )
        print ( N * 2 )

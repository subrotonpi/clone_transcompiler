def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.K = self.K
        h = [ self.Scanner.__getitem__ ( self.N ) for self in self.Scanner ]
        h = [ self.Scanner.__getitem__ ( self.N ) for self in h ]
        h = [ self.Scanner.__getitem__ ( self.N ) for self in h ]
        min = sys.maxint
        for i in range ( self.N + K - 1 , self.N ) :
            min = min ( min , h [ i + K - 1 ] - h [ i ] )
        print ( min )

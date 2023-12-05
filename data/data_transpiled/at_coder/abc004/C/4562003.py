def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin
        self.N = self.a.count ( )
        self.n = self.N % 30
        self.j = [ 1 , 2 , 3 , 4 , 5 , 6 ]
        for x in range ( self.n ) :
            i = x % 5
            newj = self.j [ i ]
            self.j [ i ] = self.j [ i + 1 ]
            self.j [ i + 1 ] = newj
        print ( "%d" % self.j [ 0 ] , "%d" % self.j [ 1 ] , "%d" % self.j [ 2 ] , "%d" % self.j [ 3 ] , "%d" % self.j [ 4 ] , "%d" % self.j [ 5 ] )
        print ( )

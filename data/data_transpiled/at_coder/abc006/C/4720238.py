def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
        if self.n * 2 > self.m or self.n * 4 < self.m :
            print ( "-1 -1 -1" )
        else :
            if 3 * self.n <= self.m :
                print ( "0 %d %d" % ( 4 * self.n - self.m , self.m - 3 * self.n ) )
            else :
                print ( "%d %d 0" % ( self.n - self.m , self.m - 2 * self.n ) )

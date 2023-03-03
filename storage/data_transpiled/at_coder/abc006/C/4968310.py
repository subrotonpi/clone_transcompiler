def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
        if ( self.n * 2 > self.m or self.n * 4 < self.m ) :
            print ( "-1 -1 -1" )
        else :
            if ( self.n * 3 <= self.m ) :
                print ( 0 , 4 * self.n - self.m , m - 3 * self.n )
            else :
                print ( ( 3 * self.n - self.m ) , m - 2 * self.n , 0 )

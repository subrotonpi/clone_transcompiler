def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
    def run ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        ans = ( 1900 * self.m + 100 * ( self.n - self.m ) ) * int ( math.pow ( 2 , m ) )
        print ( ans )

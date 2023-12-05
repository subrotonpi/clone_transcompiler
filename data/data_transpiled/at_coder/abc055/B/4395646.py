def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def run ( self ) :
        self.n = int ( self.n )
        ans = 1
        for i in range ( self.n ) :
            ans *= ( i + 1 )
            ans %= 1000000007
        print ( ans )

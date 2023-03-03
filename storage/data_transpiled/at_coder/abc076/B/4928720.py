def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
    def run ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        ans = 1
        for i in range ( self.n ) :
            ans += min ( ans , k )
        print ( ans )

def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
    def run ( self ) :
        ans = 1
        for i in range ( self.n ) :
            ans = min ( 2 * ans , ans + k )
        print ( ans )

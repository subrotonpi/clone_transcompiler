def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.index ( 'N' )
    def run ( self ) :
        self.N = sys.argv.index ( 'N' )
        r = self.N % 10
        ans = 0
        if r < 7 :
            ans = 100 * ( self.N / 10 ) + 15 * self.r
        if r > 6 :
            ans = 100 * ( ( self.N + 9 ) / 10 )
        print ( ans )

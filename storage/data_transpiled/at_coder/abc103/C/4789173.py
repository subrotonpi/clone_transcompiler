def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
    def run ( self ) :
        self.N = sys.argv.count ( 'N' )
        ans = 0
        for i in range ( self.N ) :
            ans += self.N - 1
        print ( ans )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def run ( self ) :
        self.N = sys.stdin.read ( )
        ans = 1
        while ans * 2 <= N :
            ans *= 2
        print ( ans )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
    def run ( self ) :
        ans = B / A
        if ans > C :
            ans = C
        print ( ans )

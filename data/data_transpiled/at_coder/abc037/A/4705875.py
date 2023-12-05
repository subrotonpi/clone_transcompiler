def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.tmp = min ( self.A , self.B )
        ans = C / self.tmp
        print ( ans )

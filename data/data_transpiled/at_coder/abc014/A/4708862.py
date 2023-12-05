def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.tmp = ( self.a - 1 ) // self.b
        self.sum = self.b * ( self.tmp + 1 )
        ans = self.sum - self.a
        print ( ans )

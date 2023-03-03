def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.N = sys.stdin.read ( )
    def run ( self ) :
        for i in range ( self.N , 2_000_001 + 1 ) :
            if i % A == 0 and i % B == 0 :
                print ( i )
                return

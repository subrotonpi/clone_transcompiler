def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def run ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        min = A * ( N - 1 ) + B
        max = B * ( N - 1 ) + A
        ans = max ( 0 , max - min + 1 )
        print ( ans )

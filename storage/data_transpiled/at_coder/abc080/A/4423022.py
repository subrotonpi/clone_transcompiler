def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    N = sys.stdin.read ( )
    A = sys.stdin.read ( )
    B = sys.stdin.read ( )
    print ( int ( min ( A * N , B ) ) )

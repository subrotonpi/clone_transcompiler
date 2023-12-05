def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        A = sys.stdin.read ( )
        B = sys.stdin.read ( )
        sum = A + B
        print ( ( sum if sum < 10 else 'error' ) )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        W = sys.stdin.read ( )
        a = sys.stdin.read ( )
        b = sys.stdin.read ( )
        if a < b :
            ans = b - a - W
        else :
            ans = a - b - W
        print ( ans if ans else 0 )

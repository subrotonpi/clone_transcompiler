def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.read ( )
        K = sys.stdin.read ( )
        ans = 1
        while N > 0 :
            ans += min ( ans , K )
            N -= 1
        print ( ans )

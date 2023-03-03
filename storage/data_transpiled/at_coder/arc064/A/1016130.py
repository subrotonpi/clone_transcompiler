def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.x = sys.stdin.read ( )
    ans = last = 0
    for i in range ( N ) :
        a = sys.stdin.read ( )
        eat = max ( 0 , last + a - x )
        ans += eat
        last = a - eat
    print ( ans )
    sys.exit ( 0 )

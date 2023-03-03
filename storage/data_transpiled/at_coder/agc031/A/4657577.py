def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.s = sys.stdin.read ( )
        self.s = sys.stdin.read ( )
        self.s = sys.stdin.read ( )
        self.n30 = 30
        num = [ 0 ] * n30
        for c in s :
            ic = c - ord ( 'a' )
            num [ ic ] += 1
    DIV = 1000000007
    ans = 1
    for i in range ( n30 ) :
        ans *= num [ i ] + 1
        ans %= DIV
    ans -= 1
    if ans < 0 :
        ans += DIV
    print ( ans )

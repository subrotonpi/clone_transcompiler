def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = _sys.stdin
        self.N = self.N
        self.K = self.K
        ans = 0
        for B in range ( self.K + 1 , self.N + 1 ) :
            ans += long ( ( self.N + 1 ) / self.B ) * ( B - K ) + max ( 0 , ( self.N + 1 ) % self.B - K )
            if K == 0 :
                ans -= 1
        print ( ans )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.MOD = 1000000007
        N = self.sys.maxsize
        M = self.sys.maxsize
        if abs ( N - M ) > 1 :
            print ( 0 )
        else :
            ans = 1
            for i in range ( 2 , N + 1 ) :
                ans = ( ans * i ) % MOD
            for i in range ( 2 , M + 1 ) :
                ans = ( ans * i ) % MOD
            if N == M :
                ans = ( ans * 2 ) % MOD
            print ( ans )

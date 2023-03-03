def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.MOD = 1000000007
        N = self.sys.stdin.read ( )
        cnt = [ 0 ] * N
        for i in range ( N ) :
            cnt [ self.sys.stdin.read ( ) ] += 1
        ans = 1
        for i in range ( ( N - 1 ) % 2 , N - 1 , 2 ) :
            if cnt [ i ] == ( i , 0 ) :
                ans = ( ans * cnt [ i ] ) % MOD
            else :
                ans = 0
                break
        print ( ans )
        self.sys.exit ( ans )

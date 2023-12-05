def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.N = sys.stdin.read ( )
        MOD = 1000000007
        dp = [ 1 ] * ( N + 1 )
        dp [ 0 ] = MOD - 1
        cur = 0
        for i in range ( N ) :
            cur = ( cur + dp [ i ] ) % MOD
            if i == N - 1 :
                dp [ N ] = ( dp [ N ] + cur * N ) % MOD
            else :
                dp [ i + 1 ] = ( dp [ i + 1 ] + cur ) % MOD
                dp [ i + 2 ] = ( dp [ i + 2 ] - cur + MOD ) % MOD
                if i + 3 <= N :
                    dp [ i + 3 ] = ( dp [ i + 3 ] + cur ) % MOD
                    dp [ N ] = ( dp [ N ] + cur * ( i + 1 ) ) % MOD
                else :
                    dp [ N ] = ( dp [ N ] + cur * ( N - 1 ) ) % MOD
                dp [ N ] = ( dp [ N ] + cur * ( ( ( long ( N - 1 ) * ( N - 1 ) ) % MOD ) ) % MOD ) % MOD
        print ( ( cur + dp [ N ] ) % MOD )

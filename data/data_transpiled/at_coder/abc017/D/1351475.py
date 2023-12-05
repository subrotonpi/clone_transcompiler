def _import ( ) : return next ( )
import random
import sys
import os
import sys
class Main ( object ) :
    MOD = 1000000007
    def solve ( ) :
        N = random.randint ( 0 , N )
        M = random.randint ( 0 , M )
        F = random.choice ( range ( N ) )
        dp = [ 1 ] * N
        mark = [ 0 ] * M
        tail = 0
        acc = 0
        for i in range ( N ) :
            acc += dp [ i ]
            acc %= MOD
            acc += 1
            mark [ F [ i ] ] -= 1
            acc -= dp [ tail ]
            acc = ( acc + MOD ) % MOD
            tail += 1
        dp [ i + 1 ] = acc
    ans = dp [ N ]
    out.write ( ans )
    def tr ( * os ) :
        sys.stderr.write ( deepjoin ( * os ) )
    def tr ( as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as
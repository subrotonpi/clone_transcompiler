def import os , glob
import glob
import os
import glob
import glob
MOD = 1000000007
def dfs ( n ) :
    with open ( glob , 'r' ) as f :
        n = glob.glob ( f.read ( ) )
        print ( dfs ( n + 1 ) )
    def dfs ( n ) :
        if n == 1 : return 1
        if n == 0 : return 0
        if n in glob.glob ( f.read ( ) ) : return glob.glob ( f.read ( ) )
        if n % 2 == 1 :
            ret = ( 2 * dfs ( n // 2 ) + dfs ( n // 2 + 1 ) ) % MOD
            glob.glob ( f.read ( ) )
        else :
            ret = ( 2 * dfs ( n // 2 ) + dfs ( n // 2 - 1 ) ) % MOD
            glob.glob ( f.read ( ) )
        return ret
    return dfs ( n )

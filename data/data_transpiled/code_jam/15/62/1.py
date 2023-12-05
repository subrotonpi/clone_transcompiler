def _ _ main _ _ ( ) : return sys.stdin
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
MAX = int ( 1e6 ) + 10
mod = int ( 1e9 ) + 7
def c ( n , k ) :
    if k == 0 or k == n :
        return 1
    return int ( fact [ n ] * 1 * fact_inv [ k ] % mod * fact_inv [ n - k ] % mod )
def solve ( ) :
    tc = readline.readline ( )
    fact = [ 1 ] * MAX
    fact_inv = [ 1 ] * MAX
    MOD = int ( mod )
    for i in range ( 1 , MAX ) :
        fact [ i ] = int ( ( fact [ i - 1 ] * 1 * i % mod ) )
        fact_inv [ i ] = int ( fact [ i ] ) % mod
    dpCycles = [ 1 ] * MAX
    for sz in range ( 2 , MAX ) :
        dpCycles [ sz ] = int ( ( dpCycles [ sz - 2 ] + dpCycles [ sz - 1 ] ) * 1 * ( sz - 1 ) % mod )
    dp21 = [ 1 ] * MAX
    for sz in range ( 1 , MAX ) :
        dp21 [ sz ] = int ( dpCycles [ sz ] * 1 * fact [ sz ] % mod )
    for t in range ( tc ) :
        print ( "Case #%d: " % ( t + 1 ) , end = ' ' )
        n = readline.readline ( )
        x = readline.readline ( )
        result = 0
        for three in range ( x , n + 1 ) :
            tmp = c ( n , three ) * 1 * c ( n , three ) % mod * fact [ three ] % mod * dp21 [ n - three ] % mod
            result += tmp
        print ( result % mod , end = ' ' )
        print ( "Case #%d: " % ( t + 1 ) , end = ' ' )

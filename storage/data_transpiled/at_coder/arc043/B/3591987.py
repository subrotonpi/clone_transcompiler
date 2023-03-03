def _import ( ) : return int ( next ( ) )
def main ( ) :
    def __next__ ( n ) :
        sc = _FastScanner ( )
        N = sc.__next__ ( )
        D = sc.__next__ ( )
        print ( solve ( ) )
    MOD = 1_000_000_007
    def solve ( ) :
        D = [ ]
        dp = [ ]
        ans = 0
        for i , d in enumerate ( D ) :
            if i > 0 :
                dp [ i ] [ 0 ] += dp [ i - 1 ] [ 0 ]
                dp [ i ] [ 0 ] %= MOD
                dp [ i ] [ 1 ] += dp [ i - 1 ] [ 1 ]
                dp [ i ] [ 1 ] %= MOD
                dp [ i ] [ 2 ] += dp [ i - 1 ] [ 2 ]
                dp [ i ] [ 2 ] %= MOD
            idx = lower_bound ( D , d * 2 )
            if idx != N :
                dp [ idx ] [ 0 ] += 1
                dp [ idx ] [ 0 ] %= MOD
                dp [ idx ] [ 1 ] += dp [ i ] [ 0 ]
                dp [ idx ] [ 1 ] %= MOD
                dp [ idx ] [ 2 ] += dp [ i ] [ 1 ]
                dp [ idx ] [ 2 ] %= MOD
            ans += dp [ i ] [ 2 ]
            ans %= MOD
        return ans
    def lower_bound ( x , value ) :
        low = 0
        high = len ( x )
        while low < high :
            mid = ( ( high - low ) >> 1 ) + low
            if x [ mid ] < value :
                low = mid + 1
            else :
                high = mid
        return low
    from itertools import repeat
    return repeat ( repeat ( x , value ) )

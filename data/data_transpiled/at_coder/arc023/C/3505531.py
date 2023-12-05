def _import ( ) : return int ( next ( ) )
def main ( ) :
    fc = _import ( sys.stdin , sys.stdout )
    N = fc ( )
    A = fc ( )
    print ( solve ( ) )
    MOD = 1_000_000_007
    def solve ( ) :
        ans = 1
        prev = A [ 0 ]
        prev_idx = 0
        for i in range ( 1 , N - 1 ) :
            if A [ i ] != - 1 :
                curr = A [ i ]
                ans = mul ( ans , calc ( prev , curr , i - prev_idx ) )
                prev = curr
                prev_idx = i
        ans = mul ( ans , calc ( prev , A [ N - 1 ] , N - 1 - prev_idx ) )
        return ans
    def calc ( from_number , to_number , nbits ) :
        n = to_number - from_number + nbits - 1
        k = nbits - 1
        a = 1
        for i in range ( k ) :
            a = mul ( n - i , a )
        b = 1
        for i in range ( 1 , k + 1 ) :
            b = mul ( i , b )
        return mul ( a , pow ( b , MOD - 2 ) )
    def pow ( base , exp ) :
        if not exp :
            return 1
        ans = 1
        base %= MOD
        while exp :
            if exp & 1 == 1 :
                ans = mul ( ans , base )
            base = mul ( base , base )
            exp = exp >> 1
        return ans
    from itertools import repeat
    return repeat ( next ( ) )

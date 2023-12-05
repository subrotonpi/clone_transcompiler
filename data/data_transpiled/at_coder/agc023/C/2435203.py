def _import ( ) : return int ( next ( ) )
def main ( ) :
    global n
    global fac , i_fac
    MOD = 1000000007
    def readline ( ) :
        with open ( '/dev/null' ) as f :
            sc = f.readline ( )
            n = sc.readline ( )
            solve ( )
        return n
    def solve ( ) :
        fac = [ ]
        i_fac = [ ]
        fill_factorials ( )
        ans = 0
        prev_ways = 0
        if n == 2 :
            ans = 1
        elif n == 3 :
            ans = 4
        else :
            start = ( n // 2 ) if n % 2 == 0 else ( n + 1 ) // 2
            for k in range ( start , n ) :
                ways = ( combination ( k - 1 , n - 1 - k ) * fac [ k ] % MOD ) * fac [ n - 1 - k ] % MOD
                ans = ( ans + ( ways - prev_ways + MOD ) % MOD * k % MOD ) % MOD
                prev_ways = ways
        print ( ans )
    def combination ( n , r ) :
        if n < r : return 0
        if n < 0 : return 0
        return fac [ n ] * i_fac [ n - r ] % MOD * i_fac [ r ] % MOD
    def fill_factorials ( ) :
        fac [ 0 ] = 1
        i_fac [ 0 ] = 1
        for i in range ( 1 , len ( fac ) ) :
            fac [ i ] = i * fac [ i - 1 ] % MOD
            i_fac [ i ] = power ( fac [ i ] , MOD - 2 , MOD )
    def power ( a , b , mod ) :
        x = 1
        y = a
        while b > 0 :
            if b % 2 == 1 :
                x = x * y % mod
            y = y * y % mod
            b //= 2
        return x % mod
    return solve ( )

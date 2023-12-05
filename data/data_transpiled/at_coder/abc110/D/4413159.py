def import _main
MOD = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1000000007
    def __call__ ( self , n , m ) :
        sc = _main ( n , m )
        res = m
        ans = 1
        for i in range ( 2 , n ** 2 ) :
            cnt = 0
            while res % i == 0 :
                cnt += 1
                res //= i
            ans *= calc_carry ( cnt + n - 1 , n - 1 )
            ans %= MOD
        if res != 1 :
            ans *= calc_carry ( n , 1 )
            ans %= MOD
        print ( ans )
    def calc_carry ( self , n , k ) :
        if k > n - k :
            return calc_carry ( self , n , n - k )
        an_mul = 1
        an_div = 1
        for i in range ( k ) :
            an_mul *= int ( n - i )
            an_div *= int ( i + 1 )
            an_mul %= MOD
            an_div %= MOD
        ans = an_mul * pow ( an_div , MOD - 2 )
        ans %= MOD
        return ans
    def pow ( self , x , n ) :
        ans = 1
        while n :
            if n & 1 == 1 :
                ans = ans * x % MOD
            x = x * x % MOD
            n >>= 1
        return ans

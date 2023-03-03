def import __mod__
mod = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = mod
    def __call__ ( self , * args ) :
        sc = sys.stdin.readline ( )
        N = sc.getmaxyx ( ) [ 1 ]
        M = sc.getmaxyx ( ) [ 2 ]
        p = { }
        for i in range ( 2 , i ** 2 + 1 ) :
            while M % i == 0 :
                if i in p :
                    p [ i ] = p [ i ] + 1
                else :
                    p [ i ] = 1
                M /= i
        if M != 1 :
            if M in p :
                p [ M ] = p [ M ] + 1
            else :
                p [ M ] = 1
        ans = 1
        for b in p.values ( ) :
            ans *= __mod__ ( b + ( N - 1 ) , b )
            ans %= mod
        print ( ans )
    def calc_pow ( b , n ) :
        if n == 0 :
            return 1
        if n % 2 == 0 :
            tmp = calc_pow ( b , n // 2 )
            tmp %= mod
            return tmp * tmp % mod
        else :
            b %= mod
            tmp = calc_pow ( b , n - 1 )
            tmp %= mod
            return b * tmp % mod
    def calc_inv ( n ) :
        return calc_pow ( n , mod - 2 ) % mod
    def calc_comb ( n , r ) :
        div_a = 1
        div_b = 1
        for i in range ( r ) :
            div_a *= n - i
            div_a %= mod
        for i in range ( r ) :
            div_b *= r - i
            div_b %= mod
        div_b = calc_inv ( div_b )
        div_b %= mod
        return div_a * div_b % mod

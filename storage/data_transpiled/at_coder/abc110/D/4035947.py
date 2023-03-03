def __Comb ( t , r ) :
    from math import factorial , exp_mod , exp_mod
    r = min ( r , t - r )
    if r == 0 : return 1
    if r == 1 : return t
    ans = ( ( ( Fact ( t , 1000000007 ) * exp_mod ( r , 1000000007 ) ) % 1000000007 ) * exp_mod ( t - r , 1000000007 ) ) % 1000000007
    return ans
    def Fact ( n , mod ) :
        ans = 1
        for i in range ( 1 , n + 1 ) :
            ans = ( ans * i ) % mod
        return ans
    def rev_fact ( n , mod ) :
        ans = pow_mod ( Fact ( n , mod ) , mod - 2 , mod )
        return ans
    def pow_mod ( x , n , mod ) :
        ans = 1
        x = x % mod
        while n != 0 :
            if n % 2 == 0 :
                x = ( x ** 2 ) % mod
                n //= 2
            else :
                ans = ( ans * x ) % mod
                n -= 1
        return ans
    def main ( ) :
        sc = raw_input ( )
        n , m = sc.regs [ 0 ]
        p = 0
        ans = 1
        if m == 1 :
            ans = 1
        else :
            num = [ 0 ] * 30
            k = m
            while k % 2 == 0 :
                num [ p ] += 1
                k //= 2
            p += 1
            for i in range ( 3 , i * k + 1 , 2 ) :
                while k % i == 0 :
                    num [ p ] += 1
                    k //= i
                if num [ p ] != 0 :
                    p += 1
            if k != 1 :
                num [ p ] += 1
            for i in range ( 0 , p ) :
                ans = ( exp_mod ( num [ i ] + n - 1 , num [ i ] ) * ans ) % 1000000007
        print ( ans )
    return main ( )

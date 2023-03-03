def _import ( ) :
    from math import pow
    from os import getenv
    from os import getenv
    from os import getenv
    MOD = 1000000007
    def inv ( a ) :
        return eleva ( a , int ( MOD ) - 2 )
    def eleva ( b , e ) :
        if e == 0 : return 1
        ret = eleva ( b , e // 2 )
        ret *= ret
        ret %= MOD
        if e % 2 == 1 :
            ret *= b
            ret %= MOD
        return ret
    def main ( ) :
        with open ( getenv ( "PATH" ) , "r" ) as f :
            N = len ( f.readlines ( ) )
            fact , inv_fact = [ 0 ] , [ 1 ]
            fact [ 0 ] , inv_fact [ 1 ] = inv_fact [ 0 ] , inv_fact [ 1 ] = 1
            for i in range ( 2 , N ) :
                fact [ i ] = ( fact [ i - 1 ] * i ) % MOD
            inv_fact [ N - 1 ] = inv ( fact [ N - 1 ] )
            for i in range ( N - 2 , 2 , - 1 ) :
                inv_fact [ i ] = ( inv_fact [ i + 1 ] * ( i + 1 ) ) % MOD
            ans = fact [ N - 1 ] * ( N - 1 ) % MOD
            for k in range ( ( N + 1 ) // 2 , N - 1 ) :
                tmp = ( fact [ k - 1 ] * fact [ k ] ) % MOD
                tmp = ( tmp * inv_fact [ 2 * k - N ] ) % MOD
                ans -= tmp
            ans %= MOD
            ans += MOD
            ans %= MOD
            print ( ans )
    return main

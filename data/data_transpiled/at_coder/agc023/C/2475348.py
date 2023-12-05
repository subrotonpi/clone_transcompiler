def _import ( ) :
    from math import log
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
            fact , inv_fact = [ ] , [ ]
            for i in range ( 2 , N ) :
                if inv_fact [ i ] == 0 :
                    for j in range ( i , N , i ) :
                        inv_fact.append ( i )
            fact.append ( inv_fact [ 0 ] )
            inv_fact.append ( inv_fact [ 1 ] )
            for i in range ( 2 , N ) :
                fact [ i ] = ( fact [ i - 1 ] * i ) % MOD
                p = int ( inv_fact [ i ] )
                if p == i :
                    inv_fact [ i ] = inv ( i )
                else :
                    inv_fact [ i ] = ( inv_fact [ p ] * inv_fact [ i // p ] ) % MOD
            for i in range ( 2 , N ) :
                inv_fact [ i ] = ( inv_fact [ i ] * inv_fact [ i - 1 ] ) % MOD
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

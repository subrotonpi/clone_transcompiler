def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            s = sc.readline ( )
            a = [ None ] * len ( s )
            for c in s :
                if c == 'A' :
                    a [ 0 ] = a [ 0 ] + 1
                    continue
                a [ 0 ] = a [ 0 ]
            c = [ None ] * len ( s )
            for c in s :
                if c == 'C' :
                    c [ 0 ] = c [ 0 ] + 1
                    continue
                c [ 0 ] = c [ 0 ]
            hatena = [ None ] * len ( s )
            for c in s :
                if c == '?' :
                    hatena [ 0 ] = c [ 0 ] + 1
                    continue
                hatena [ 0 ] = c [ 0 ]
            ans = 0
            MOD = 1000000007
            for c in s :
                if c == '?' or c == 'B' :
                    a_cnt = a [ 0 ]
                    c_cnt = c [ 0 ] - c [ 0 ]
                    hatena_left = hatena [ 0 ]
                    hatena_right = hatena [ 1 ] - hatena [ 1 ]
                    ans += a_cnt * c_cnt % MOD * pow ( 3 , hatena_left + hatena_right , MOD ) % MOD
                    ans %= MOD
                    ans += a_cnt * c_cnt % MOD * pow ( 3 , hatena_left + hatena_right - 1 , MOD ) % MOD
                    ans %= MOD
                    ans += hatena_left * c_cnt % MOD * pow ( 3 , hatena_left + hatena_right - 1 , MOD ) % MOD
                    ans %= MOD
                    ans += hatena_left * c_cnt % MOD * pow ( 3 , hatena_left + hatena_right - 1 , MOD ) % MOD
                    ans %= MOD
                    ans += hatena_left * c_cnt % MOD * pow ( 3 , hatena_left + hatena_right - 1 , MOD ) % MOD
                    ans %= MOD
                    ans += hatena_left * c_cnt % MOD * pow ( 3 , hatena_left + hatena_right - 1 , MOD ) % MOD
                    ans %= MOD
    return Main ( )

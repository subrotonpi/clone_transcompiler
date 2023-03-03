def import _pow3
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        sc = _pow3 ( )
        s = sc.next ( )
        n = len ( s )
        cntA = [ 0 ] * ( n + 1 )
        cntB = [ 0 ] * ( n + 1 )
        cntC = [ 0 ] * ( n + 1 )
        cntQ = [ 0 ] * ( n + 1 )
        cntA [ 0 ] = cntB [ 0 ] = cntC [ 0 ] = cntQ [ 0 ] = 0
        for i in range ( 1 , n + 1 ) :
            c = s [ i - 1 ]
            cntA [ i ] = cntA [ i - 1 ]
            cntB [ i ] = cntB [ i - 1 ]
            cntC [ i ] = cntC [ i - 1 ]
            cntQ [ i ] = cntQ [ i - 1 ]
            if c == 'A' :
                cntA [ i ] += 1
            elif c == 'B' :
                cntB [ i ] += 1
            elif c == 'C' :
                cntC [ i ] += 1
            else :
                cntQ [ i ] += 1
        ans = 0
        for i in range ( n ) :
            left = right = 0
            if s [ i ] == 'B' or s [ i ] == '?' :
                left += cntA [ i + 1 ] * pow3 ( cntQ [ i ] ) % MOD
                left += cntQ [ i ] * pow3 ( cntQ [ i ] - 1 ) % MOD
                left %= MOD
                right += ( cntC [ i ] - cntC [ i + 1 ] ) * pow3 ( cntQ [ i ] - 1 ) % MOD
                right += ( cntQ [ i ] - cntQ [ i + 1 ] ) * pow3 ( cntQ [ i ] - 1 ) % MOD
                right %= MOD
                ans += left * right % MOD
                ans %= MOD
        print ( ans )
    def pow3 ( n ) :
        if n < 0 :
            return 0
        if n % 2 == 0 :
            d = pow3 ( n // 2 )
            return d * d % MOD
        return 3 * pow3 ( n - 1 ) %
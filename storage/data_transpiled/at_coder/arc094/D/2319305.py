def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        self.MOD = 998244353
    def main ( ) :
        S = sc.next ( )
        N = len ( S )
        all = True
        any = False
        sum = S [ N - 1 ] - '0'
        for i in range ( N - 1 ) :
            if S [ i ] != S [ i + 1 ] :
                all = False
            else :
                any = True
            sum += S [ i ] - '0'
        sum %= 3
        if all :
            print ( 1 )
            return
        if N == 2 :
            print ( 2 )
            return
        if N == 3 and not any and S [ 0 ] != S [ 2 ] :
            print ( 3 )
            return
        dp = [ [ 1 for i in range ( 3 ) ] for j in range ( 3 ) ]
        for i in range ( N - 1 ) :
            for j in range ( 3 ) :
                for k in range ( 3 ) :
                    for l in range ( 3 ) :
                        if l == k :
                            continue
                        dp [ ( j + l ) % 3 ] [ l ] [ i + 1 ] += dp [ j ] [ k ] [ i ]
                        if dp [ ( j + l ) % 3 ] [ l ] [ i + 1 ] >= MOD :
                            dp [ ( j + l ) % 3 ] [ l ] [ i + 1 ] -= MOD
        ans = 1
        for i in range ( N - 1 ) :
            ans *= 3
            ans %= MOD
        for i in range ( 3 ) :
            ans += MOD - dp [ sum ] [ i ] [ N - 1 ]
        if not any :
            ans += 1
        print ( ans % MOD )

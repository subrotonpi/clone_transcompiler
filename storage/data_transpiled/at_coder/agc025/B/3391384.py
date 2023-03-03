def import _main
class Main ( object ) :
    MOD = 998244353
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.A = int ( self.A )
        self.B = int ( self.B )
        self.K = int ( self.K )
        ans = 0
        comb = [ 1 ]
        for i in range ( 1 , n + 1 ) :
            comb.append ( comb [ i - 1 ] * ( n - i + 1 ) % MOD * pow ( i , MOD - 2 ) % MOD )
        q = K + A
        for x in range ( 0 , n ) :
            q -= A
            if q % B == 0 :
                y = q // B
                if y > n : continue
                if y < 0 : break
                ans = ( ans + comb [ x ] * comb [ int ( y ) ] % MOD ) % MOD
        print ( ans )
    def pow ( self , a , b ) :
        if b == 1 : return a
        if b % 2 == 0 :
            d = pow ( a , b // 2 )
            return d ** 2 % MOD
        return a * pow ( a , b - 1 ) % MOD

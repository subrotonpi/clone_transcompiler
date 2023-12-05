def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 998244353
    def __call__ ( self , n , A , B , K ) :
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
    def calc ( self , n , a ) :
        MulSumN = 1
        MulSumA = 1
        for i in range ( 1 , a + 1 ) :
            MulSumN *= n - i + 1
            MulSumN %= MOD
            MulSumA *= i
            MulSumA %= MOD
        return MulSumN * pow ( MulSumA , MOD - 2 ) % MOD
    def pow ( self , a , b ) :
        if b == 1 : return a
        if b % 2 == 0 :
            d = pow ( a , b // 2 )
            return d ** 2 % MOD
        return a * pow ( a , b - 1 ) % MOD

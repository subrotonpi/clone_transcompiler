def _import ( ) : return False
class Main ( ) :
    MOD = 1000000007
    def pow ( self , n ) :
        ans = 1
        tmp = n
        while True :
            if not self.k :
                return ans
            if self.k % 2 == 1 :
                ans = ( ans * tmp ) % MOD
            tmp = ( tmp * tmp ) % MOD
            self.k /= 2
    def divisors ( n ) :
        list = [ ]
        for i in range ( 1 , n + 1 ) :
            if n % i == 0 :
                list.append ( i )
                if i != n // i :
                    list.append ( n // i )
            list.sort ( )
            return list
        return [ ]
    def main ( ) :
        r = FS ( )
        N , K = r.read ( )
        divisor = divisors ( N )
        num = [ ]
        tmp_sum = 0
        for i in range ( len ( divisor ) ) :
            num.append ( pow ( K , ( divisor [ i ] + 1 ) // 2 ) )
            for j in range ( i ) :
                if divisor [ i ] % divisor [ j ] == 0 :
                    num [ i ] -= num [ j ]
            while num [ i ] < 0 :
                num [ i ] += MOD
            tmp_sum += num [ i ]
            tmp_sum %= MOD
        ans = 0
        for i in range ( len ( divisor ) ) :
            if num [ i ] < 0 :
                num [ i ] += MOD
            num [ i ] = num [ i ] % MOD
        for i in range ( len ( divisor ) ) :
            d = int ( divisor [ i ] )
            if d % 2 == 0 :
                ans += num [ i ] * d // 2
            else :
                ans += num [ i ] * d
        return ans

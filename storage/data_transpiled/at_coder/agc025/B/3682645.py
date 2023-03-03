def main ( ) :
    from math import ceil
    M = 998244353L
    class Main ( object ) :
        def __init__ ( self ) :
            self.M = M
        def __call__ ( self , * args ) :
            self.N = int ( self.N )
            self.A = int ( self.A )
            self.B = int ( self.B )
            self.K = int ( self.K )
            print ( self.solve ( self.N , self.A , self.B , self.K ) )
        def solve ( self , N , A , B , K ) :
            if A > B :
                return self.solve ( self.N , self.B , self.A , self.K )
            fact = [ 1 ]
            for i in range ( self.N + 1 ) :
                fact [ i + 1 ] = fact [ i ] * ( N - i ) % M
            factinv = [ 1 ]
            for i in range ( 1 , self.N + 1 ) :
                factinv [ i ] = factinv [ i - 1 ] * inverse ( i , M ) % M
            res = 0
            for i in range ( 0 , min ( self.N , K // B ) ) :
                if ( K - B * i ) % A == 0 :
                    j = ( K - B * i ) // A
                    if j > N :
                        continue
                    jj = int ( j )
                    c = fact [ i ] * factinv [ i ] % M
                    c *= fact [ jj ] * factinv [ jj ] % M
                    res += c % M
                    res %= M
            return res
        def inverse ( self , a , mod ) :
            return modpow ( self , a , mod - 2 , mod )
        def modpow ( self , a , n , mod ) :
            res = 1
            while n :
                if n % 2 == 1 :
                    res = ( res * a ) % mod
                a = ( a ** a ) % mod
                n >>= 1
            return res % mod
    return Main ( )

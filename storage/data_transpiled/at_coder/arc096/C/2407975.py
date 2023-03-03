def _import ( ) :
    from math import pow
    from numpy import pi
    class Main ( object ) :
        def __init__ ( self ) :
            self.comb = [ ]
        def run ( self ) :
            with self.sc :
                N = self.M
                f = [ [ 0 , 0 ] ] * ( self.N + 1 )
                f [ 0 ] [ 0 ] = 1
                for i in range ( 1 , N + 1 ) :
                    for j in range ( 0 , i ) :
                        f [ i ] [ j ] = f [ i - 1 ] [ j ] * ( j + 1 ) + ( f [ i - 1 ] [ j - 1 ] if j - 1 >= 0 else 0 )
                        f [ i ] [ j ] %= M
            self.comb [ 0 ] [ 0 ] = 1
            for i in range ( 1 , len ( self.comb ) ) :
                for j in range ( 0 , i ) :
                    self.comb [ i ] [ j ] = ( self.comb [ i - 1 ] [ j - 1 ] if j > 0 else 0 ) + self.comb [ i - 1 ] [ j ]
                    self.comb [ i ] [ j ] %= M
            self.ans = 0
            for i in range ( 0 , N + 1 ) :
                sum = 0
                for k in range ( 0 , i ) :
                    sum += self.f [ i ] [ k ] * pow ( 2 , ( N - i ) * k , M ) % M
                    sum %= M
                self.ans += ( 1 if i % 2 == 0 else - 1 ) * pow ( 2 , pow ( 2 , N - i , M - 1 ) , M ) % M * sum % M * self.comb [ N ] [ i ] % M
                self.ans = ( self.ans + M ) % M
            print ( self.ans )
        def pow ( self , a , n , mod ) :
            ret = 1
            a %= mod
            for n in range ( 0 , n ) :
                if n % 2 == 1 :
                    ret = ret * a % mod
            return ret

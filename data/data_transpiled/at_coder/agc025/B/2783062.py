def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.mod = 998244353
    def main ( self ) :
        n , a , b , k , r , n_Ca = self.s.split ( )
        n_Ca [ 0 ] = 1
        for i in range ( 1 , n + 1 ) :
            n_Ca [ i ] = n_Ca [ i - 1 ] * ( n - i + 1 ) % mod * pow ( i , mod - 2 ) % mod
        for i in range ( 0 , n ) :
            l = int ( ( k - a * i ) // b )
            if ( k - a * i ) % b == 0 and 0 <= l <= n :
                r += n_Ca [ i ] * n_Ca [ l ]
                r %= mod
        print ( r )
    def pow ( self , n , a ) :
        if a == 1 :
            return n
        if a % 2 == 0 :
            d = pow ( self , n // 2 )
            return d ** 2 % mod
        return n * pow ( self , n - 1 ) % mod

def import _main
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.fact = [ ]
        self.invfact = [ ]
        self.fact.append ( self.invfact [ 0 ] )
        for i in range ( 1 , N ) :
            self.fact [ i ] = ( self.fact [ i - 1 ] ) % MOD
            self.invfact.append ( self.power_mod ( self.fact [ i ] , MOD - 2 ) )
    def power_mod ( self , x , exponent ) :
        prod = 1
        for i in range ( 63 , - 1 , - 1 ) :
            prod = ( prod * prod ) % MOD
            if ( exponent & 1 << i ) :
                prod = ( prod * x ) % MOD
        return prod
    def comb ( self , x , y ) :
        if x < 0 :
            return 0
        if y < 0 or y > x :
            return 0
        r = ( self.fact [ x ] * power_mod ( ( self.fact [ x - y ] * self.fact [ y ] ) % MOD , MOD - 2 ) ) % MOD
        return r
    def f ( self , m , i , k ) :
        t = self.fact [ m ] * self.invfact [ m - i * k ] % MOD
        t = t * self.invfact [ k ] % MOD
        return t * self.power_mod ( self.invfact [ i ] , k ) % MOD
    def main ( self ) :
        self.initialize ( )
        Scanner ( ).run ( )
        n , a , b , c , d = next ( )
        dp = [ [ 1 ] * b + 2 , n + 1 ]
        dp [ a ] [ n ] = 1
        for i in range ( a , b + 1 ) :
            for j in range ( 0 , n ) :
                dp [ i + 1 ] [ j ] = dp [ i ] [ j ]
                for k in range ( c , min ( d , j // i ) + 1 ) :
                    dp [ i + 1 ] [ j - i * k ] += f ( j , i , k ) * dp [ i ] [ j ] % MOD
    print ( dp [ b
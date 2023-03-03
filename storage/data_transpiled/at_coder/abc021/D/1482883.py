def import _main
class Main ( object ) :
    INF = 1000000007
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.K = int ( self.K )
        self.print ( self.get_homogeneous_combination ( N , K ) )
    def get_homogeneous_combination ( self , n ) :
        return self.get_combination ( n - 1 + r , n - 1 )
    def get_combination ( self , n , r ) :
        mod_dup = [ 1 ] * n
        mod_inv_dup = [ 1 ] * n
        mod_dup [ 0 ] = 1
        mod_inv_dup [ n ] = 1
        for i in range ( 1 , n + 1 ) :
            mod_dup [ i ] = ( mod_dup [ i - 1 ] * i ) % INF
        tmp = mod_dup [ n ]
        doubling = INF - 2
        while doubling > 0 :
            if doubling % 2 == 1 :
                mod_inv_dup [ n ] = ( mod_inv_dup [ n ] * tmp ) % INF
            tmp = ( tmp * tmp ) % INF
            doubling //= 2
        for i in range ( n , 0 , - 1 ) :
            mod_inv_dup [ i - 1 ] = mod_inv_dup [ i ] * i % INF
        ans = mod_dup [ n ]
        ans = ans * mod_inv_dup [ r ] % INF
        ans = ans * mod_inv_dup [ n - r ] % INF
        return ans

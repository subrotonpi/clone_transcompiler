def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.A = int ( self.A )
        self.B = int ( self.B )
        self.C = int ( self.C )
        self.bamboo_lengths = [ len ( self.bamboo_lengths ) for i in range ( self.N ) ]
        print ( self.get_min_cost ( 0 , 0 , 0 , 0 , 0 ) )
    def get_min_cost ( self , i , a , b , c , cost ) :
        if self.i == self.N :
            return ( cost + abs ( A - a ) + abs ( B - b ) + abs ( C - c ) ) if a != 0 and b != 0 and c != 0 else sys.maxint
        bamboo_length = self.bamboo_lengths [ i ]
        use_for_a = self.get_min_cost ( i + 1 , a + bamboo_length , b , c , a or 0 )
        use_for_b = self.get_min_cost ( i + 1 , a , b + bamboo_length , c , b or 0 )
        use_for_c = self.get_min_cost ( i + 1 , a , b , c + bamboo_length , c or 0 )
        dont_use = self.get_min_cost ( i + 1 , a , b , c , cost )
        return min ( use_for_a , min ( use_for_b , min ( use_for_c , dont_use ) ) )

def _import ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = random.randint ( 0 , 10 )
            self.B = random.randint ( 0 , 10 )
            self.C = random.randint ( 0 , 10 )
            self.l = [ random.randint ( 0 , 10 ) for i in range ( self.N ) ]
            self.out ( calmin ( 0 , 0 , 0 , l , 0 , 0 ) )
        def calmin ( a , b , c , l , i , cost ) :
            if i == len ( l ) :
                if a == 0 or b == 0 or c == 0 :
                    return sys.maxint
                else :
                    return cost + abs ( A - a ) + abs ( B - b ) + abs ( C - c ) - 30
            return min ( min ( calmin ( a + l [ i ] , b , c , l , i + 1 , cost + 10 ) , calmin ( a , b , c + l [ i ] , l , i + 1 , cost + 10 ) ) , min ( calmin ( a , b , c + l [ i ] , l , i + 1 , cost + 10 ) , calmin ( a , b , c , l , i + 1 , cost + 10 ) ) )

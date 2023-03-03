def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = self.n , self.k
    def go ( self ) :
        sc = _main.raw_input ( )
        self.n , self.k = sc.n , sc.k
        dp = [ [ 1 ] * ( n + 1 ) for i in range ( self.k + 1 ) ]
        for i in range ( self.n - 1 , - 1 , - 1 ) :
            for j in range ( self.k + 1 ) :
                for l in range ( 2 ) :
                    p = 1.0 / ( self.n + 1 )
                    r = ( 1.0 - p ) * self.dp [ i + 1 ] [ j ] [ l ] + p * max ( self.dp [ i + 1 ] [ j + 1 ] [ 1 ] , self.dp [ i + 1 ] [ j ] [ 0 ] )
                    self.dp [ i ] [ j ] [ l ] = r
        print ( self.dp [ 0 ] [ 0 ] [ 0 ] )

def import import _sys , os , sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m = sys.stdin.read ( ).split ( '\n' )
        self.gragh = [ [ 0 ] * ( n + 1 ) for n in range ( self.n + 1 ) ]
        self.dp = [ 0 ] * int ( math.pow ( 2 , self.n ) )
        for i in range ( self.m ) :
            self.gragh [ self.n - 1 ] [ self.m - 1 ] += 1
        self.dp [ 0 ] = 1
        for i in range ( 1 , len ( self.dp ) ) :
            for j in range ( self.n ) :
                if ( ( self.dp [ j ] >> 1 ) & 1 ) == 1 :
                    for k in range ( self.n ) :
                        if ( ( self.dp [ j ] >> 1 ) & 1 ) == 1 and self.gragh [ j ] [ k ] == 1 :
                            break
                    if k == self.n :
                        self.dp [ i ] += self.dp [ i - ( 1 << j ) ]
        print ( self.dp [ - 1 ] )

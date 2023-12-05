def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.W = sys.stdin.read ( )
        self.N = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        self.width = [ ]
        self.value = [ ]
        for i in range ( self.N ) :
            self.width.append ( self.width [ i ] )
            self.value.append ( self.value [ i ] )
    dp = [ [ 0 for i in range ( self.N + 1 ) ] for i in range ( self.W + 1 ) ]
    for i in range ( self.N ) :
        for j in range ( 1 , self.W + 1 ) :
            for k in range ( 1 , self.K + 1 ) :
                if self.width [ i ] <= j :
                    dp [ i + 1 ] [ j ] [ k ] = max ( dp [ i ] [ j - self.width [ i ] ] [ k - 1 ] + self.value [ i ] , dp [ i ] [ j ] [ k ] )
                else :
                    dp [ i + 1 ] [ j ] [ k ] = dp [ i ] [ j ] [ k ]
    print ( dp [ self.N ] [ self.W ] [ self.K ] )

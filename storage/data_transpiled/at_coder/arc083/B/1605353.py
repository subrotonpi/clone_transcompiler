def import import _sys , os , sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv [ 1 ]
        self.dist = [ [ ] for i in range ( self.n ) ]
    def main ( self ) :
        self.n = sys.argv [ 2 ]
        self.dist = [ [ ] for i in range ( self.n ) ]
        self.sum = 0
        for i in range ( self.n ) :
            for j in range ( self.i + 1 , self.n ) :
                self.sum += long ( self.dist [ i ] [ j ] )
        self.subtracted = [ False for i in range ( self.n ) ]
        for j in range ( self.n ) :
            for k in range ( self.n ) :
                if k == self.i or k == self.j :
                    continue
                if self.dist [ i ] [ j ] > self.dist [ i ] [ k ] + self.dist [ k ] [ j ] :
                    print ( - 1 )
                    return
                if not self.subtracted [ i ] [ j ] and self.dist [ i ] [ j ] == self.dist [ i ] [ k ] + self.dist [ k ] [ j ] :
                    self.sum -= long ( self.dist [ i ] [ j ] )
                    self.subtracted [ i ] [ j ] = True
    print ( self.sum )

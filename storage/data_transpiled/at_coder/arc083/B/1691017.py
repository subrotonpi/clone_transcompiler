def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main.raw_input ( )
        self.dp = [ [ ] for _ in range ( n ) ]
        self.edges = [ [ ] for _ in range ( n ) ]
        self.del = [ [ ] for _ in range ( n ) ]
        total = 0
        for i in range ( n ) :
            for j in range ( n ) :
                self.edges [ i ] [ j ] = sc.__next__ ( )
                total += self.edges [ i ] [ j ]
        self.dp = [ [ ] for _ in range ( n ) ]
        for i in range ( 1 , n ) :
            for j in range ( n ) :
                self.dp [ i ] [ j ] [ 0 ] = self.edges [ i ] [ j ]
        for k in range ( 1 , n ) :
            for i in range ( n ) :
                for j in range ( n ) :
                    self.dp [ i ] [ j ] [ k ] = min ( self.dp [ i ] [ j ] [ k - 1 ] , self.dp [ i ] [ k ] [ k - 1 ] + self.dp [ k ] [ j ] [ k - 1 ] )
        for i in range ( n ) :
            for j in range ( n ) :
                if i != j and self.dp [ i ] [ j ] [ n - 1 ] != self.edges [ i ] [ j ] :
                    print ( - 1 )
                    return
        for k in range ( n ) :
            for i in range ( n ) :
                for j in range ( n ) :
                    if i != j and j != k and i != k and self.edges [ i ] [ j ] == self.edges [ i ] [ k ] + self.edges [ k ] [ j ] and not self.del [ i ] [ j ] :
                        total -= self.edges [ i ] [ j ]
                        self.del [ i ] [ j ] = True
        total /= 2
        print ( total )
return Main

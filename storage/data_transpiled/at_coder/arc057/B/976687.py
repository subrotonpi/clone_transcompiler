def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n = self.s.n
        self.k = self.s.k
        self.as = [ ]
        self.asum = [ 0 ]
        for i in range ( 1 , self.n + 1 ) :
            a = s.randint ( 0 , 1 )
            self.asum.append ( self.asum [ i - 1 ] + a )
        if self.asum [ self.n ] == self.k :
            print ( 1 )
            return
        dptable = [ [ sys.maxint ] * self.asum [ i ] for i in range ( 0 , self.n + 1 ) ]
        for i in range ( 2 , self.n + 1 ) :
            for j in range ( 0 , self.n + 1 ) :
                dptable [ i ] [ j ] = sys.maxint
        dptable [ 0 ] [ 0 ] = 0
        dptable [ 1 ] [ 0 ] = 0
        dptable [ 1 ] [ 1 ] = 1
        for i in range ( 2 , self.n + 1 ) :
            dptable [ i ] [ 0 ] = 0
            for j in range ( 1 , self.i + 1 ) :
                dptable [ i ] [ j ] = dptable [ i - 1 ] [ j ]
                if dptable [ i - 1 ] [ j - 1 ] < sys.maxint :
                    temp = dptable [ i - 1 ] [ j - 1 ] * self.asum [ i ] / self.asum [ i - 1 ] + 1
                    if temp - dptable [ i - 1 ] [ j - 1 ] <= self.asum [ i ] - self.asum [ i - 1 ] :
                        dptable [ i ] [ j ] = min ( dptable [ i ] [ j ] , temp )
        for i in range ( self.n ) :
            if dptable [ self.n ] [ i + 1 ] > self.asum [ i ] :
                print ( i )
                return
        print ( self.n )

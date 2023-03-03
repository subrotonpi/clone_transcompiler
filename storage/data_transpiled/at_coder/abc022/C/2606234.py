def import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m = int ( self.n ) , int ( self.m )
        INF = float ( self.INF ) / 10
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.n = int ( self.n )
        self.m = int ( self.m )
        self.d = [ [ 0 for i in range ( self.n ) ] for j in range ( self.n ) ]
    def __init__ ( self ) :
        for i in range ( self.m ) :
            if i == j :
                self.d [ i ] [ j ] = 0
            else :
                self.d [ i ] [ j ] = INF
    def __init__ ( self ) :
        for i in range ( self.n ) :
            source = self.d [ i ] [ - 1 ]
            dest = self.d [ i ] [ - 1 ]
            len = self.d [ dest ] [ source ] [ - 1 ]
            self.d [ source ] [ dest ] = d [ dest ] [ source ] [ len ]
        for k in range ( 1 , self.n ) :
            for i in range ( 1 , self.n ) :
                for j in range ( 1 , self.n ) :
                    self.d [ i ] [ j ] = min ( self.d [ i ] [ j ] , self.d [ i ] [ k ] + self.d [ k ] [ j ] )
    def dist ( self ) :
        for i in range ( 1 , self.n ) :
            for j in range ( 1 , self.n ) :
                if i != j :
                    self.dist = min ( self.dist , self.d [ 0 ] [ i ] + self.d [ i ] [ j ] + self.d [ j ] [ 0 ] )
        if dist == INF :
            self.print ( - 1 )
        else :
            self.print ( dist )

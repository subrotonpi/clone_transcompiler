def import math
class Main ( object ) :
    INF = math.ceil ( math.pi / 2 )
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.N = int ( self.N )
        self.M = int ( self.M )
        g = [ [ INF , 0 ] for i in range ( self.N ) ]
        for a , b , c in self.M :
            g [ a ] [ b ] = min ( g [ a ] [ b ] , c )
            g [ b ] [ a ] = min ( g [ b ] [ a ] , c )
        for k in self.M :
            for i in self.N :
                for j in self.N :
                    g [ i ] [ j ] = min ( g [ i ] [ j ] , g [ i ] [ k ] + g [ k ] [ j ] )
        for a in self.N :
            for x , y , z in self.N :
                g [ x ] [ y ] = min ( g [ x ] [ y ] , z )
                g [ y ] [ x ] = min ( g [ y ] [ x ] , z )
                s = 0
                for i in self.N :
                    for j in self.N :
                        g [ i ] [ j ] = min ( g [ i ] [ j ] , g [ i ] [ x ] + g [ x ] [ y ] + g [ y ] [ j ] )
                        g [ i ] [ j ] = min ( g [ i ] [ j ] , g [ i ] [ y ] + g [ x ] [ j ] )
                        if i < j :
                            s += g [ i ] [ j ]

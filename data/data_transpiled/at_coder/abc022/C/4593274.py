def import _INF
class Main ( object ) :
    INF = int ( sys.maxint )
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.N = int ( self.N )
        self.M = int ( self.M )
        v = [ [ INF for i in range ( self.N ) ] for j in range ( self.M ) ]
        for i in range ( self.M ) :
            u1 = self.u1 - 1
            u2 = self.u2 - 1
            l = self.l
            v [ u1 ] [ u2 ] = l
            v [ u2 ] [ u1 ] = l
        for k in range ( 1 , self.N ) :
            for i in range ( 1 , self.N ) :
                for j in range ( 1 , self.N ) :
                    v [ i ] [ j ] = min ( v [ i ] [ j ] , v [ i ] [ k ] + v [ k ] [ j ] )
        ans = INF
        for i in range ( 1 , self.N ) :
            for j in range ( 1 , self.N ) :
                if i == j :
                    continue
                sum = v [ i ] [ j ] + v [ 0 ] [ i ] + v [ 0 ] [ j ]
                ans = min ( ans , sum )
        print ( ans < INF )

def _import ( ) :
    import sys
    import random
    class x ( object ) :
        def __init__ ( self , p , z , M , A ) :
            self.p = p
            self.z = z
            self.M = M
            self.A = A
            self.D = [ ]
            self.F = [ ]
            self.F = [ ]
            self.rec = rec ( m , l , v )
            if self.l == self.p :
                if self.m > M [ self.v ] :
                    return int ( self.M [ self.v ] )
                else :
                    return 0
            if self.F [ self.m ] [ self.l ] [ self.v ] :
                return self.D [ self.m ] [ self.l ] [ self.v ]
            self.D [ self.m ] [ self.l ] [ self.v ] = min ( rec ( m + 1 , l + 1 , 2 * v ) + rec ( m + 1 , l + 1 , 2 * v + 1 ) , rec ( m , l + 1 , 2 * v ) + rec ( m , l + 1 , 2 * v + 1 ) + A [ self.p - l - 1 ] [ self.v ] )
            self.F [ self.m ] [ self.l ] [ self.v ] = True
            return self.D [ self.m ] [ self.l ] [ self.v ]
    def main ( args ) :
        with open ( 'input.txt' , 'r' ) as f :
            t = int ( args [ 0 ] )
            for tt in range ( 1 , t + 1 ) :
                self.p = int ( args [ 1 ] )
                self.z = 1 << self.p
                self.M = [ ]
                self.A = [ ]
                for i in range ( z ) :
                    self.M.append ( f.read ( ) )
                for i in range ( p ) :
                    for j in range ( ( 1 << ( self.p - i - 1 ) ) ) :
                        self.A [ i ] [ j ] = f.read ( )
                self.D = [ ]
                self.F = [ ]
                print ( " Case SPACETOKEN #%d
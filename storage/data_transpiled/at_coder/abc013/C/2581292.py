def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = float ( self.N )
        self.H = float ( self.H )
        self.A = float ( self.A )
        self.B = float ( self.B )
        self.C = float ( self.C )
        self.D = float ( self.D )
        self.E = float ( self.E )
        cost = int ( self.cost )
        for i in range ( self.N + 1 ) :
            Y = max ( 0 , math.floor ( ( ( self.N - i ) * E - B * self.i - H ) / ( self.D + E ) ) + 1 )
            cost = min ( cost , self.cost , i * A + Y * C )
        print ( long ( cost ) )

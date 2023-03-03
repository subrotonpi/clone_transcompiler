def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.L = float ( 'inf' )
        self.X = float ( 'inf' )
        self.Y = float ( 'inf' )
        self.S = float ( 'inf' )
        self.D = float ( 'inf' )
        if self.S < self.D :
            if self.X < self.Y :
                print ( '%.10f\n' % min ( ( self.D - self.S ) / ( self.X + self.Y ) , ( self.L - ( self.D - self.S ) ) / ( self.Y - self.X ) ) )
            else :
                print ( '%.10f\n' % ( self.D - self.S ) )
        elif self.D < self.S :
            if self.X < self.Y :
                print ( '%.10f\n' % min ( ( self.S - self.D ) / ( self.Y - self.X ) , ( self.L - ( self.S - self.D ) ) / ( self.X + self.Y ) ) )
            else :
                print ( '%.10f\n' % ( self.L - self.S - self.D ) )
        else :
            print ( '0' )

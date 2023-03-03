def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.n % 12
        self.m = self.m
        self.n = 360 / 12 * self.n + 0.5 * self.m
        self.m *= 6
        self.print ( min ( ( self.n + self.m ) % 360 , self.360 - ( self.n + self.m ) % 360 ) )

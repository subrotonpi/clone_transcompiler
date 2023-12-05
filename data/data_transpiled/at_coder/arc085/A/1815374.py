def import math
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = Scanner ( )
        self.N , self.M = self.Scanner.scan ( )
        x = 1900 * self.M + 100 * ( self.N - self.M )
        print ( int ( x * math.pow ( 2 , self.M ) ) )

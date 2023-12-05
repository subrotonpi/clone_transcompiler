def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        s = self.k * int ( math.pow ( self.k - 1 , self.n - 1 ) )
        print ( s )

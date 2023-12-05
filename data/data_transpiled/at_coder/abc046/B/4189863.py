def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        print ( self.k * int ( math.pow ( self.k - 1 , self.n - 1 ) ) )

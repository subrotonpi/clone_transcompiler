def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        self.n , self.x = sc.__next__ ( )
        if self.n / 2 < self.x :
            self.print ( self.n - self.x )
        else :
            self.print ( self.x - 1 )

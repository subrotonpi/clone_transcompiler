def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        self.x = int ( self.x )
        self.y = int ( self.y )
    def __repr__ ( self ) :
        return "%s %s" % ( self.x * min ( self.n , self.k ) , self.y * ( self.n - self.k ) )

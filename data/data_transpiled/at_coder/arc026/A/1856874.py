def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.a = int ( self.a )
        self.b = int ( self.b )
        self.dyn = min ( self.n , 5 )
        self.hdn = self.n - self.dyn
        print ( self.a * self.hdn + self.b * self.dyn )

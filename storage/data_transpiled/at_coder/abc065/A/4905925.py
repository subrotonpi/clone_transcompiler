def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.maxint
        self.a = sys.maxint
        self.b = sys.maxint
        if self.a >= self.b :
            print ( "delicious" )
        elif self.a < self.b and self.a + self.x + 1 > self.b :
            print ( "safe" )
        else :
            print ( "dangerous" )

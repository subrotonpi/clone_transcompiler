def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 0 ]
        self.plus = self.a == '+'
        self.b = sys.argv [ 1 ]
        print ( self.a + self.b if self.plus else self.a - self.b )

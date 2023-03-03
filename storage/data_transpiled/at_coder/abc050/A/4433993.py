def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 0 ]
        self.op = sys.argv [ 1 ]
        self.b = sys.argv [ 2 ]
        self.plus = '+'
        self.minus = '-'
        if self.op == self.plus :
            print ( self.a + self.b )
        elif self.op == self.minus :
            print ( self.a - self.b )

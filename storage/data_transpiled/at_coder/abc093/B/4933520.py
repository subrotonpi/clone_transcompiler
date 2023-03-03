def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        for i in range ( self.a , self.b + 1 ) :
            if i < self.a + self.k or i > self.b - self.k :
                print ( i )

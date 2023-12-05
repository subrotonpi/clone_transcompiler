def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        for i in range ( self.a , self.a + k ) :
            if i <= self.b :
                print ( i )
        for i in range ( self.b - k + 1 , self.b + k ) :
            if i >= self.a + k and i >= self.a :
                print ( i )

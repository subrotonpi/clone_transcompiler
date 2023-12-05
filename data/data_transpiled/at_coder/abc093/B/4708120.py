def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        x = b - self.a + 1
        for i in range ( self.k ) :
            if self.k > x :
                for j in range ( 0 , b - self.a ) :
                    print ( self.a + j )
                break
            print ( self.a + i )
        for i in range ( self.k - 1 , - 1 , - 1 ) :
            if self.a + self.k - 1 < self.b - i :
                print ( self.b - i )

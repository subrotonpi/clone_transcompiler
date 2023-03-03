def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        if self.b - self.a + 1 >= self.k * 2 :
            for i in range ( self.a , self.a + self.k ) :
                print ( i )
            for i in range ( self.k , 0 , - 1 ) :
                print ( self.b - i + 1 )
        else :
            for i in range ( self.a , self.b + 1 ) :
                print ( i )

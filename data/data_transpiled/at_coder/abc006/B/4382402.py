def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a , self.b , self.c , self.n = 0 , 0 , 1 , sys.stdin.read ( )
    def run ( self ) :
        for i in range ( 1 , n ) :
            w = self.c
            self.c = ( self.a + self.b + self.c ) % 10007
            self.a , self.b = self.b , self.w
        print ( self.a )

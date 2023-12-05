def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a , self.b , self.n = sys.stdin.read ( ).split ( '\n' )
        if self.a + self.b == self.n and self.a - self.b == self.n :
            print ( '?' )
        elif self.a + self.b == self.n :
            print ( '+' )
        elif self.a - self.b == self.n :
            print ( '-' )
        else :
            print ( '!' )

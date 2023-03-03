def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
        self.a = sys.maxint
        self.b = sys.maxint
        for i in range ( self.m ) :
            if self.n <= self.a :
                self.n += self.b
            self.n -= self.a
            if self.n < 0 :
                self.print ( 1 )
                return
        print ( "complete" )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 0 ]
        self.b = sys.argv [ 1 ]
        self.a += 1
        self.b += 1
        if self.a + self.b < 10 :
            print ( self.a + self.b )
        else :
            print ( "error" )

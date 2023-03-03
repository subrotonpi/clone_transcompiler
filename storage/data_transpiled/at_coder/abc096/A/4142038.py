def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 0 ]
        self.b = sys.argv [ 1 ]
        if self.a > self.b :
            print ( self.a - 1 )
        else :
            print ( self.a )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 0 ]
        if self.a == 1 :
            print ( "Hello World" )
        if self.a == 2 :
            b = sys.argv [ 1 ]
            c = sys.argv [ 2 ]
            print ( b + c )

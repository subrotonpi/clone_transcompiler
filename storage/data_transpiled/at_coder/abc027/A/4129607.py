def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 0 ]
        self.b = sys.argv [ 1 ]
        self.c = sys.argv [ 2 ]
        if self.a == self.b :
            print ( self.c )
        elif self.a == self.c :
            print ( self.b )
        elif self.b == self.c :
            print ( self.a )

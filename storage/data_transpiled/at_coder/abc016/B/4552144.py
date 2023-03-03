def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 0 ]
        self.b = sys.argv [ 1 ]
        self.c = sys.argv [ 2 ]
        p = False
        m = False
        if self.a + self.b == self.c :
            p = True
        if self.a - self.b == self.c :
            m = True
        if self.p and self.m :
            print ( "?" )
        elif self.p :
            print ( "+" )
        elif self.m :
            print ( "-" )
        else :
            print ( "!" )

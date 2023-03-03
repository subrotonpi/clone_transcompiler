def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.a = sys.argv [ 1 ]
        if self.a == 12 :
            print ( 1 )
        else :
            print ( self.a + 1 )

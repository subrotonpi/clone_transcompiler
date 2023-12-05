def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys._getframe ( 1 )
        self.n = self.sc.f_lineno
        print ( self.n )
        for i in range ( self.n ) :
            print ( 1 )

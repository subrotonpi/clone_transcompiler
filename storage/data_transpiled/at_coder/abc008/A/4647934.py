def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys._getframe ( 1 )
        self.i = self.sc.f_lineno
        print ( self.sc.f_lineno - self.i + 1 )

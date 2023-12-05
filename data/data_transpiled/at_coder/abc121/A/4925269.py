def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.H , self.W , self.h , self.w = self.s.split ( ' ' )
        print ( ( self.W - self.w ) * self.H )

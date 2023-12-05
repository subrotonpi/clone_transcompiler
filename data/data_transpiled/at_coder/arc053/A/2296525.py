def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.H , self.W = self.sc.read ( ).split ( ' ' )
        print ( ( self.H - 1 ) * self.W + self.H * ( self.W - 1 ) )

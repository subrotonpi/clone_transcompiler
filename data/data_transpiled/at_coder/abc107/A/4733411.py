def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.i = sys.argv [ 0 ] , sys.argv [ 1 ]
    def run ( self ) :
        self.N , self.i = self.N , self.i
        print ( self.N - self.i + 1 )

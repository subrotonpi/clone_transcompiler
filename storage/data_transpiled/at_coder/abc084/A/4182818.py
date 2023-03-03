def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.M = sys.maxint
    def __call__ ( self , * args ) :
        self.hour = 24 - self.M
        print ( self.hour + 24 )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def __call__ ( self ) :
        if self.n == 1 :
            print ( "Not Prime" )
            return
        if self.n in [ 2 , 3 , 5 ] :
            print ( "Prime" )
            return
        if self.n % 2 == 0 or self.n % 3 == 0 or self.n % 5 == 0 :
            print ( "Not Prime" )
        else :
            print ( "Prime" )

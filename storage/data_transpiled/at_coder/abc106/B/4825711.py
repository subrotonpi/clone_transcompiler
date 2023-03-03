def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv [ 1 ]
    def __call__ ( self ) :
        if self.n >= 195 :
            print ( 5 )
        elif self.n >= 189 :
            print ( 4 )
        elif self.n >= 165 :
            print ( 3 )
        elif self.n >= 135 :
            print ( 2 )
        elif self.n >= 105 :
            print ( 1 )
        else :
            print ( 0 )

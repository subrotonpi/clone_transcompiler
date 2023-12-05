def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 1 ]
        if self.a % 2 == 0 :
            print ( self.a / 2 ** 2 / 2 )
        else :
            print ( self.a / 2 ** ( self.a / 2 + 1 ) )

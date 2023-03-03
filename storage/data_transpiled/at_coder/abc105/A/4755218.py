def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = int ( self.sc )
        b = int ( self.sc )
        if a % b != 0 :
            print ( 1 )
        else :
            print ( 0 )

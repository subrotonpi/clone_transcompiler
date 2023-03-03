def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = int ( self.sc )
        if a % 2 == 0 :
            print ( a )
        else :
            print ( 2 * a )

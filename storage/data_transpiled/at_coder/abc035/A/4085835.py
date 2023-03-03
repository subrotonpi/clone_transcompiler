def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.w , self.h = sys.argv [ 1 ] , sys.argv [ 2 ]
        if self.w % 16 == 0 and self.h % 9 == 0 :
            print ( "16:9" )
        else :
            print ( "4:3" )

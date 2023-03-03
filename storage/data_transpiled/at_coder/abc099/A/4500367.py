def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        N = self.sc.read ( )
        if N >= 1000 :
            print ( "ABD" )
        else :
            print ( "ABC" )

def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.__next__ ( )
        if self.N <= 59 :
            print ( "Bad" )
        elif self.N <= 89 :
            print ( "Good" )
        elif self.N <= 99 :
            print ( "Great" )
        else :
            print ( "Perfect" )

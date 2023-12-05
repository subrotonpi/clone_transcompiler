def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        N = self.Scanner.number
        if N % 2 == 0 :
            print ( "Blue" )
            return
        else :
            print ( "Red" )
            return

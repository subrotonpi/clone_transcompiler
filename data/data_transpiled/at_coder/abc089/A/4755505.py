def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = sys.argv.count ( 'N' )
        if self.N > 3 :
            print ( self.N / 3 )
        else :
            print ( 0 )

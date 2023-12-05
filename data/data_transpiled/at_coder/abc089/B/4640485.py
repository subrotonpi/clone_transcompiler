def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.c = 0
        for a in sys.stdin :
            if a == 'Y' :
                self.c += 1
        if self.c != 0 :
            print ( 'Four' )
        else :
            print ( 'Three' )

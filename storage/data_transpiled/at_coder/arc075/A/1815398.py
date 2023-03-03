def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __call__ ( self , * args ) :
        self.M = sys.maxint
        total = 0
        for i in range ( 1 , N + 1 ) :
            n = raw_input ( )
            total += n
            if n < M and n % 10 :
                M = n
        if total % 10 :
            print ( total )
        elif M == sys.maxint :
            print ( 0 )
        else :
            print ( total - M )

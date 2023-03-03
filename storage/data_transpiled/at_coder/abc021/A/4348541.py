def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        if self.n % 2 == 0 :
            a = self.n / 2
            print ( a )
            for i in range ( a ) :
                print ( 2 )
        else :
            a = self.n / 2
            print ( a + 1 )
            print ( 1 )
            for i in range ( a ) :
                print ( 2 )

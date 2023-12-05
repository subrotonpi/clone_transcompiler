def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 200
        self.L = range ( 200 )
        self.dmin = 100
        self.N = self.N
        for i in range ( self.N ) :
            A = self.N
            d = 0
            while A % 2 == 0 :
                A /= 2
                d += 1
            self.dmin = min ( self.dmin , d )
        print ( self.dmin )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
        self.x = sys.maxint
        self.l = 0
        self.r = 0
        for i in range ( self.m ) :
            a = sys.maxint
            if a < x :
                self.l += 1
            if x < a :
                self.r += 1
        print ( min ( self.l , self.r ) )

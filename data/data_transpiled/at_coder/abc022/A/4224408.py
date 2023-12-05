def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.s = sys.maxint
        self.t = sys.maxint
        self.w = 0
        self.count = 0
        for i in range ( self.n ) :
            self.w += self.w
            if self.w >= self.s and self.w <= self.t :
                self.count += 1
        print ( self.count )

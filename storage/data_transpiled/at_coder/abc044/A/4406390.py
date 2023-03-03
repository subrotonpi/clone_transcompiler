def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        self.x = int ( self.x )
        self.y = int ( self.y )
        self.add = 0
        if self.n - self.k > 0 :
            for i in range ( self.k ) :
                self.add = self.add + self.x
        else :
            for i in range ( self.n ) :
                self.add = self.add + self.x
        for j in range ( self.n - self.k ) :
            self.add = self.add + self.y
        print ( self.add )

def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __init__ ( self ) :
        self.max1 , self.max2 = - 1 , - 1
        for a in range ( self.N ) :
            if self.max1 < a :
                self.max2 , self.max1 = self.max1 , a
            elif self.max2 < a and self.max1 > self.max2 :
                self.max2 = self.max2
        print ( self.max2 )

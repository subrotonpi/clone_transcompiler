def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        n = self.n
        x = self.x
        a0 = self.a0
        count = 0
        for i in range ( 1 , n ) :
            a1 = self.a1
            if a0 + a1 > x :
                count += a0 + a1 - x
                if a1 >= a0 + a1 - x :
                    a1 -= a0 + a1 - x
                else :
                    a1 = 0
            a0 = a1
        print ( count )

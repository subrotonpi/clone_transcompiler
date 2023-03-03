def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.x = int ( self.x )
        self.min = 1000
        self.sum = 0
        for i in range ( self.n ) :
            num = self.n
            min = min ( min , num )
            self.sum += num
        print ( self.n , ( self.x - self.sum ) / self.min )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.sum , self.max = 0 , 0
        for i in range ( self.n ) :
            d = sys.stdin.read ( )
            self.sum += d
            self.max = max ( d , self.max )
        print ( self.sum )
        print ( max ( 0 , 2 * self.max - self.sum ) )

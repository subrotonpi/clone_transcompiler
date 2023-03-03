def import import _sys , os
class Main ( object ) :
    def __init__ ( self ) :
        self.patty = [ 0 ] * 51
        self.size = [ 0 ] * 51
        def main ( self ) :
            n = self.n
            x = self.x
            self.patty [ 0 ] = 1
            self.size [ 0 ] = 1
            for i in range ( 1 , 50 ) :
                self.patty [ i ] = self.patty [ i - 1 ] * 2 + 1
                self.size [ i ] = self.patty [ i ] * 2 - 1
            print ( self.calc ( n , x ) )
        def calc ( self , level , x ) :
            if x == 0 :
                return 0
            if x >= self.size [ level ] :
                return self.patty [ level ]
            if x * 2 > self.size [ level ] :
                return self.patty [ level - 1 ] + 1 + self.calc ( self.level - 1 , x - self.size [ level - 1 ] - 2 )
            else :
                return self.calc ( self.level - 1 , x - 1 )

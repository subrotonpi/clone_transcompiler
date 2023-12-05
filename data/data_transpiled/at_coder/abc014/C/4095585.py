def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
    def main ( self ) :
        self.arr = [ 0 ] * 1000001
        for i in range ( self.n ) :
            a = self.arr [ i ]
            b = self.arr [ i ]
            self.arr [ a ] += 1
            if b + 1 < len ( self.arr ) :
                self.arr [ b + 1 ] -= 1
        for i in range ( 1 , len ( self.arr ) ) :
            self.arr [ i ] = self.arr [ i ] + self.arr [ i - 1 ]
        self.arr.sort ( )
        print ( self.arr [ - 1 ] )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n = self.n
        self.x = self.x
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( s.read ( ) )
    def sum ( self ) :
        if self.a [ 0 ] > x :
            self.sum += self.a [ 0 ] - x
            self.a [ 0 ] = x
        for i in range ( 1 , self.n ) :
            if self.a [ i ] + self.a [ i - 1 ] > x :
                self.sum += self.a [ i ] + self.a [ i - 1 ] - x
                self.a [ i ] = x - self.a [ i - 1 ]
        print ( self.sum )

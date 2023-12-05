def import import os
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.x = int ( self.x )
        self.a = [ ]
        count = 0
        for i in range ( self.N ) :
            self.a.append ( self.a [ i ] )
        for i in range ( self.N - 1 ) :
            if x < self.a [ i ] + self.a [ i + 1 ] :
                if self.a [ i + 1 ] >= ( self.a [ i + 1 ] + self.a [ i ] ) - x :
                    count += self.a [ i + 1 ] + self.a [ i ] - x
                    self.a [ i + 1 ] = self.a [ i + 1 ] - ( ( self.a [ i + 1 ] + self.a [ i ] ) - x )
                else :
                    count += self.a [ i + 1 ]
                    count += abs ( self.a [ i + 1 ] - ( ( self.a [ i + 1 ] + self.a [ i ] ) - x ) )
                    self.a [ i + 1 ] = 0
                    self.a [ i ] = self.a [ i ] - abs ( self.a [ i + 1 ] - ( ( self.a [ i + 1 ] + self.a [ i ] ) - x ) )
        print ( count )

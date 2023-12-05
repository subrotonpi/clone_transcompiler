def import import os
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __getitem__ ( self , key ) :
        self.a = [ ]
        self.a.append ( key )
        s = 0
        for i in range ( self.n ) :
            self.a [ i + 1 ] = self.a [ i ]
            s += abs ( self.a [ i + 1 ] - self.a [ i ] )
        s += abs ( self.a [ n + 1 ] - self.a [ n ] )
        s -= abs ( self.a [ 1 ] - self.a [ 0 ] )
        for i in range ( 1 , self.n + 1 ) :
            if i > 1 :
                s += abs ( self.a [ i - 1 ] - self.a [ i - 2 ] )
            s += abs ( self.a [ i + 1 ] - self.a [ i - 1 ] )
            if i > 1 :
                s -= abs ( self.a [ i ] - self.a [ i - 2 ] )
            s -= abs ( self.a [ i + 1 ] - self.a [ i ] )
            print ( s )

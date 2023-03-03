def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
        self.q = int ( sys.stdin.read ( ) )
        self.a = [ ]
        self.p = [ ]
        for i in range ( self.m ) :
            c = self.a [ i ]
            b = self.a [ i ]
            self.a [ c ] [ b ] += 1
        for i in range ( self.n - 1 , 1 , - 1 ) :
            for j in range ( i , self.n + 1 ) :
                self.a [ i ] [ j ] += self.a [ i + 1 ] [ j ] + self.a [ i ] [ j - 1 ] - self.a [ i + 1 ] [ j - 1 ]
        for i in range ( self.q ) :
            h = self.a [ i ]
            w = self.a [ i ]
            self.p [ i ] [ 0 ] = h
            self.p [ i ] [ 1 ] = w
        for i in range ( self.q ) :
            print ( self.a [ self.p [ i ] [ 0 ] ] [ self.p [ i ] [ 1 ] ] )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.m = int ( sys.stdin.readline ( ).strip ( ) )
        self.q7 = int ( sys.stdin.readline ( ).strip ( ) )
        self.q = [ [ 0 for i in range ( self.n + 1 ) ] for l in range ( self.m ) ]
        for i in range ( self.n - 1 , 1 , - 1 ) :
            for j in range ( self.i , self.n + 1 ) :
                self.q [ i ] [ j ] += self.q [ i + 1 ] [ j ] + self.q [ i ] [ j - 1 ] - self.q [ i + 1 ] [ j - 1 ]
    def __init__ ( self ) :
        self.q = [ [ 0 for i in range ( self.q7 ) ] for j in range ( self.q7 ) ]

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.map = [ [ ] for i in range ( 2 ) ]
        self.sum = [ [ ] for i in range ( 2 ) ]
        self.sum [ 0 ] [ 0 ] = self.map [ 0 ] [ 0 ]
        for j in range ( 1 , n ) :
            self.sum [ 0 ] [ j ] = self.sum [ 0 ] [ j - 1 ] + self.map [ 0 ] [ j ]
        self.sum [ 1 ] [ 0 ] = self.sum [ 0 ] [ 0 ] + self.map [ 1 ] [ 0 ]
        for j in range ( 1 , n ) :
            self.sum [ 1 ] [ j ] = max ( self.sum [ 0 ] [ j ] , self.sum [ 1 ] [ j - 1 ] ) + self.map [ 1 ] [ j ]
        print ( self.sum [ 1 ] [ n - 1 ] )

def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        line = self.line.split ( ) [ : n ]
        result = 0
        for i in range ( self.n ) :
            x = int ( line [ i ] )
            result += 2 * min ( x , k - x )
        print ( result )

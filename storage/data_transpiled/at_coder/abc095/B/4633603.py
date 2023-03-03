def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
        self.count = self.N
        self.sum = 0
        self.hairetu = [ ]
        for i in range ( self.N ) :
            self.hairetu.append ( self.X )
            self.sum += self.hairetu [ i ]
        min = self.hairetu [ 0 ]
        for i in range ( self.N ) :
            if min > self.hairetu [ i ] :
                min = self.hairetu [ i ]
        ans = ( self.X - self.sum ) / min
        print ( ans , self.count )

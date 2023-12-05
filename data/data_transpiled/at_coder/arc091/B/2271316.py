def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
    def run ( self ) :
        count = 0
        if k == 0 :
            count = long ( self.n ) * self.n
            print ( count )
        else :
            for y in range ( self.k + 1 , self.n + 1 ) :
                count += long ( self.n / y ) * ( y - self.k )
                if self.n % y >= self.k :
                    count += long ( self.n % y - self.k + 1 )
            print ( count )

def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N , self.M = self.Scanner.__next__ ( )
        self.b = [ 0 ] * self.M
        for i in range ( self.N ) :
            K = self.Scanner.__next__ ( )
            for j in range ( K ) :
                a = self.Scanner.__next__ ( ) - 1
                self.b [ a ] += 1
    count = 0
    for i in range ( self.M ) :
        if self.b [ i ] == self.N :
            count += 1
    print ( count )

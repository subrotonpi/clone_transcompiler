def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.M = self.M
        if ( self.N * 2 > self.M or self.N * 4 < self.M ) :
            print ( "-1 -1 -1" )
        else :
            if ( self.N * 3 <= self.M ) :
                print ( 0 , 4 * self.N - self.M , M - 3 * self.N )
            else :
                print ( ( 3 * self.N - self.M ) , M - 2 * self.N , 0 )

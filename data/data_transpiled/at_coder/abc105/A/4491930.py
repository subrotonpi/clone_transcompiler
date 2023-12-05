def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.Scanner.N
        self.M = self.Scanner.M
        if self.N % self.M == 0 :
            self.print ( 0 )
        else :
            self.print ( 1 )

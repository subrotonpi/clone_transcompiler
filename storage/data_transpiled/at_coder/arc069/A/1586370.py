def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.Scanner.N
        self.M = self.Scanner.M
        self.result = 0
        if self.M >= 2 * self.N :
            self.result = self.N + ( self.M - 2 * self.N ) / 4
        else :
            self.result = self.M / 2
        print ( self.result )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.M = sys.maxint
    def run ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        self.ans = 0
        if self.N >= 3 and self.M >= 3 :
            self.ans = long ( self.N - 2 ) * long ( self.M - 2 )
        elif self.N == 1 and self.M == 1 :
            self.ans = 1
        elif ( self.N == 1 and self.M == 2 ) or ( self.N == 2 and self.M == 1 ) or ( self.N == 2 and self.M == 2 ) :
            self.ans = 0
        elif self.N == 1 :
            self.ans = self.M - 2
        elif self.M == 1 :
            self.ans = N - 2
        elif self.N == 2 :
            self.ans = 0
        elif self.M == 2 :
            self.ans = 0
        print ( self.ans )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.m = sys.maxint
        self.n = sys.maxint
        self.N = sys.maxint
        self.rest = 0
        self.product = 0
        self.ans = self.N
        while self.N >= self.m :
            self.product = ( self.N // self.m ) * self.n
            self.rest = self.N % self.m
            self.N = self.product + self.rest
            self.ans += self.product
        print ( self.ans )

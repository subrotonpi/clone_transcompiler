def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.m = sys.maxint
        self.n = sys.maxint
        self.N = sys.maxint
        self.sum = self.N
        a = 0
        num = self.N
        while a >= m or num != 0 :
            a += num
            num = 0
            if a >= m :
                num += a // m * n
                self.sum += num
                a = a % m
        print ( self.sum )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.m = sys.stdin.read ( )
        self.n = sys.stdin.read ( )
        self.N = sys.stdin.read ( )
        self.sum = self.N
        self.pen = 0
        while 1 :
            temp = self.N // self.n
            pen = self.N % self.m
            self.N = self.temp + pen
            self.sum += temp
            if self.N < self.m :
                break
        print ( self.sum )

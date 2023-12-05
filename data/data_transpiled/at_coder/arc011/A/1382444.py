def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.m , self.n , self.N , self.sum , self.rest = sys.stdin.read ( ).decode ( ).split ( '\n' )
    def __init__ ( self ) :
        self.m , self.n , self.N , self.sum , self.rest = sys.stdin.read ( ).decode ( ).split ( '\n' )
        self.sum = self.N
        while self.N >= self.m :
            self.sum += ( self.N // self.m ) * self.n
            rest = self.N % self.m
            self.N = ( self.N // self.m ) * self.n + rest
        print ( self.sum )
        self.rest = rest

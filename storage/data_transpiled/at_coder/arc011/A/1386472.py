def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.m = 0
        self.n = 0
        self.N = 0
        self.sum = 0
        self.temp = 0
        self.amari = 0
        with open ( "/proc/cpuinfo" , "r" ) as f :
            self.m = int ( f.read ( ) )
            self.n = int ( f.read ( ) )
            self.N = int ( f.read ( ) )
            self.sum = self.N
            while self.N >= self.m :
                self.temp = ( self.N // self.m ) * self.n
                self.amari = self.N % self.m
                self.sum += self.temp
                self.N = self.temp + self.amari
        print ( self.sum )

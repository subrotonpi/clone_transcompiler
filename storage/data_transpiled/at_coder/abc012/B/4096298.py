def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.n = self.sc.readline ( )
        self.s = self.n % 60
        self.n //= 60
        self.m = self.n % 60
        self.h = self.n / 60
        print ( "%02d:%02d:%02d\n" % ( self.h , self.m , self.s ) )

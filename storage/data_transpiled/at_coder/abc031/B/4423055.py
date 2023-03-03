def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        for i in range ( self.k ) :
            a = sys.stdin.read ( )
            print ( ( a < n ) * ( n - a ) if a > m else - 1 )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.sum = [ a + b , b + c , c + a ]
        min = sys.maxint
        for i in range ( 3 ) :
            if min > self.sum [ i ] :
                min = self.sum [ i ]
        print ( min )

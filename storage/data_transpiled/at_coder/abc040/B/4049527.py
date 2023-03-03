def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def main ( ) :
        self.min = sys.maxint
        for i in range ( 1 , 2 ** n + 1 ) :
            x = n // i
            v = abs ( x - i ) + n - ( i * x )
            if min > v :
                min = v
        print ( min )

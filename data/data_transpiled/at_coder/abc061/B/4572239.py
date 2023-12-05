def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        line = self.sc.readline ( ).split ( )
        N = int ( line [ 0 ] )
        M = int ( line [ 1 ] )
        array = [ 0 ] * ( N + 1 )
        for i in range ( M ) :
            input = self.sc.readline ( ).split ( )
            a = int ( input [ 0 ] )
            b = int ( input [ 1 ] )
            array [ a ] += 1
            array [ b ] += 1
        for i in range ( 1 , N + 1 ) :
            print ( array [ i ] )

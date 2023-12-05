def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def main ( ) :
        a = [ 0 ] * 1000001
        a [ 1 ] = 0
        a [ 2 ] = 0
        a [ 3 ] = 1
        for i in range ( 4 , n + 1 ) :
            a [ i ] = a [ i - 1 ] + a [ i - 2 ] + a [ i - 3 ]
            a [ i ] %= 10007
        print ( a [ n ] )

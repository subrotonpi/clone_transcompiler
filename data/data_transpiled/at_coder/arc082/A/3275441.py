def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.a = [ 0 ] * 100010
        for atmp in range ( self.n ) :
            self.a [ atmp ] += 1
            self.a [ atmp + 1 ] += 1
            self.a [ atmp + 2 ] += 1
    def main ( ) :
        num = sys.argv [ 1 ]
        max = 0
        for i in range ( 100010 ) :
            if a [ i ] > max :
                max = a [ i ]
        print ( max )

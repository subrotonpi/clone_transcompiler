def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.count ( )
    def __init__ ( self ) :
        self.map = { }
        self.map [ 0 ] = 2
        self.map [ 1 ] = 1
        for i in range ( 2 , self.N + 1 ) :
            self.map [ i ] = self.map [ i - 2 ] + self.map [ i - 1 ]
        print ( self.map [ N ] )

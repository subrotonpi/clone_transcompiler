def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = _sys.stdin
        self.N = self.N
    def __init__ ( self ) :
        self.L = [ ]
        self.L.append ( 2 )
        self.L.append ( 1 )
        for i in range ( 2 , self.N + 1 ) :
            self.L [ i ] = self.L [ i - 1 ] + self.L [ i - 2 ]
        print ( self.L [ self.N ] )

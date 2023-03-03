def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.Q = sys.stdin.read ( )
        self.q = [ [ ] for i in range ( self.Q ) ]
    def run ( self ) :
        self.a = [ ]
        for i in range ( self.Q ) :
            for j in range ( self.q [ i ] [ 0 ] - 1 , self.q [ i ] [ 1 ] ) :
                self.a.append ( self.q [ i ] [ 2 ] )
        for i in range ( self.N ) :
            print ( self.a [ i ] )

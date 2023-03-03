def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.Q = sys.stdin.read ( )
        self.L = [ ]
        self.R = [ ]
        self.p = [ ]
        self.q = [ ]
        self.LR = [ [ ] for _ in range ( self.M ) ]
        for i in range ( self.M ) :
            self.L.append ( self.N )
            self.R.append ( self.N )
            self.LR [ L [ i ] ] [ R [ i ] ] += 1
        for i in range ( self.Q ) :
            self.p.append ( self.N )
            self.q.append ( self.Q )
    def execute ( self ) :
        for x in range ( 1 , self.N + 1 ) :
            for y in range ( 1 , self.N + 1 ) :
                self.LR [ x ] [ y ] += self.LR [ x ] [ y - 1 ] + self.LR [ x - 1 ] [ y ] - self.LR [ x - 1 ] [ y - 1 ]
        for i in range ( self.Q ) :
            self.sum = self.LR [ self.q [ i ] ] [ q [ i ] ] - self.LR [ self.p [ i ] - 1 ] [ q [ i ] ] - self.LR [ self.q [ i ] ] [ p [ i ] - 1 ] + self.LR [ self.q [ i ] - 1 ] [ p [ i ] - 1 ]
            print ( self.sum )

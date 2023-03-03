def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.M = self.M
        self.Q = self.Q
    table = [ 0 ] * ( N + 1 )
    for i in range ( self.M ) :
        table [ self.N ] [ self.M ] += 1
    for i in range ( 1 , self.N + 1 ) :
        for j in range ( self.N ) :
            table [ i ] [ j + 1 ] += table [ i ] [ j ]
    for i in range ( self.Q ) :
        p = self.p
        q = self.q
        sum = 0
        for j in range ( p , q + 1 ) :
            sum += table [ j ] [ q ] - table [ j ] [ p - 1 ]
        print ( sum )

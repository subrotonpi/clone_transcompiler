def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.Q = sys.stdin.read ( )
        self.LR = [ ]
        self.sum = [ ]
        for i in range ( self.M ) :
            li = self.N
            ri = self.Q
            self.LR [ li ] [ ri ] += 1
        for i in range ( 1 , self.N + 1 ) :
            for j in range ( 1 , self.N + 1 ) :
                self.sum [ i ] [ j ] += self.sum [ i ] [ j - 1 ] + self.LR [ i ] [ j ]
    ANS = [ ]
    for i in range ( self.Q ) :
        ans = 0
        pi = self.N
        qi = self.Q
        for j in range ( pi , qi + 1 ) :
            ans += self.sum [ j ] [ qi ] - self.sum [ j ] [ pi - 1 ]
        ANS.append ( ans )
    for i in range ( self.Q ) :
        print ( ANS [ i ] )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
    def run ( self ) :
        tn = [ ]
        for i in range ( self.N ) :
            tn.append ( i )
        ans = self.T
        term = 0
        for i in range ( 1 , self.N ) :
            term = tn [ i ] - tn [ i - 1 ]
            if term > self.T :
                ans += self.T
            else :
                ans += term
        print ( ans )
        self.run ( )

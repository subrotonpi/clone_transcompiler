def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N , T = self.sc.shape
        self.c , self.t = [ ] , [ ]
    def main ( self ) :
        self.c , self.t = self.c , self.t
        self.mincost = 10000
        ok = False
        for i in range ( self.N ) :
            if t [ i ] <= T :
                if self.c [ i ] < self.mincost :
                    self.mincost = self.c [ i ]
                ok = True
        if ok :
            print ( self.mincost )
        else :
            print ( "TLE" )

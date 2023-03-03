def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.s = [ ]
        for i in range ( n ) :
            self.s.append ( i )
        self.m = int ( sys.stdin.readline ( ).strip ( ) )
        self.t = [ ]
        self.point = 0
        for i in range ( self.n ) :
            plus = 0
            minus = 0
            for j in range ( self.n ) :
                if self.s [ i ] == self.s [ j ] :
                    plus += 1
            for k in range ( self.m ) :
                if self.s [ i ] == self.t [ k ] :
                    minus += 1
            if self.point < plus - minus :
                self.point = plus - minus
        print ( self.point )

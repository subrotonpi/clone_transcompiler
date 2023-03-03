def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.s = [ ]
        for i in range ( n ) :
            self.s.append ( i )
        self.m = int ( sys.stdin.readline ( ).strip ( ) )
        self.t = [ ]
        for i in range ( m ) :
            self.t.append ( i )
        self.max = int ( self.max )
        for i in range ( n ) :
            cb = cr = 0
            for j in range ( n ) :
                if self.s [ i ] == self.s [ j ] : cb += 1
            for j in range ( m ) :
                if self.s [ i ] == self.t [ j ] : cr += 1
            if self.max < cb - cr :
                self.max = self.cb - cr
        print ( self.max )
        self.n = int ( sys.stdin.readline ( ).strip ( ).strip ( ) )

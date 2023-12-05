def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.s = sys.stdin.read ( ).decode ( 'utf-8' )
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.s = sys.stdin.read ( ).decode ( 'utf-8' )
        self.cnt = 0
        for i in range ( 1 , N ) :
            if i == 'E' :
                self.cnt += 1
        self.min = self.cnt
        for i in range ( 1 , N ) :
            if s [ i - 1 ] == 'W' :
                self.cnt += 1
            if s [ i ] == 'E' :
                self.cnt -= 1
            if self.cnt < self.min :
                self.min = self.cnt
        print ( self.min )

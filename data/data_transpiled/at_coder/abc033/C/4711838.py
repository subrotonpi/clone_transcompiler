def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.data = sys.stdin.read ( )
        self.n = len ( self.data )
        self.output = 0
        self.tmp = 1
        for i in range ( self.n // 2 + 1 ) :
            if self.data [ i * 2 ] == '0' :
                self.tmp = 0
            if self.i * 2 + 1 == self.n or self.data [ i * 2 + 1 ] == '+' :
                self.output += self.tmp
                self.tmp = 1
        print ( self.output )

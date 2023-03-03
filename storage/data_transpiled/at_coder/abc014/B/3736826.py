def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.line = self.line.split ( )
        self.n , self.x = self.line [ 0 ] , self.line [ 1 ]
        self.result = 0
        self.line = self.line.split ( )
        for i in range ( self.n ) :
            if self.x & ( 1 << i ) :
                self.result += int ( self.line [ i ] )
        print ( self.result )

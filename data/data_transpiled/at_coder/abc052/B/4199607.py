def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.max = 0
        self.sum = 0
        for i in range ( len ( self.s ) ) :
            if self.s [ i ] == 'I' :
                self.sum += 1
            else :
                self.sum -= 1
            if self.max < self.sum :
                self.max = self.sum
        print ( self.max )
        self.s = sys.stdin.read ( )

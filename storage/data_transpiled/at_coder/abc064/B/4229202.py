def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
    def main ( self ) :
        self.min = 1001
        self.max = - 1
        for i in range ( self.n ) :
            tmp = sys.stdin.read ( )
            if tmp < self.min :
                min = tmp
            if tmp > self.max :
                max = tmp
        print ( self.max - min )
        self.n = n

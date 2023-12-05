def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.d = sys.stdin.read ( )
        self.N = sys.stdin.read ( )
    def run ( self ) :
        self.i = 1
        self.result = 0
        self.term = int ( math.pow ( 100 , self.d ) )
        while self.N != 0 :
            self.result = self.term * self.i
            self.i += 1
            tmp = self.result
            num = 0
            while ( tmp % 100 == 0 ) :
                tmp /= 100
                num += 1
            if num > self.d :
                self.i += 1
            self.N -= 1
        self.result = self.i * self.term
        print ( self.result )

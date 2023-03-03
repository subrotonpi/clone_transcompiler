def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.stdin )
        self.s = sys.stdin.read ( )
        self.t = sys.stdin.read ( )
        self.count = self.n
        for i in range ( self.n ) :
            match = True
            for j in range ( self.n - i ) :
                if self.s [ j + i ] != self.t [ j ] :
                    match = False
            if match :
                self.count = i
                break
        print ( self.n , self.count )

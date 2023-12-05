def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
        self.weight = sys.stdin.read ( )
        self.count = 0
        for i in range ( self.N - 1 ) :
            if self.weight >= self.S and self.weight <= self.T :
                self.count += 1
            self.weight = self.weight + self.weight
        if self.weight >= self.S and self.weight <= self.T :
            self.count += 1
        print ( self.count )

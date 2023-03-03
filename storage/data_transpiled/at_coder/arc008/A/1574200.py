def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = sys.maxint
        self.count = 0
        while self.N - 10 >= 0 :
            self.count += 1
            self.N -= 10
        if self.N >= 7 :
            self.count += 1
            print ( 100 * self.count )
            return
        else :
            print ( self.N * 15 + 100 * self.count )
            return

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.output = 0
        self.n = len ( self.sc )
        for i in range ( self.n ) :
            if self.sc % 6 == 1 or self.sc % 3 == 0 :
                pass
            elif self.sc % 6 == 2 or self.sc % 4 == 0 :
                self.output += 1
            elif self.sc % 6 == 0 :
                self.output += 2
            elif self.sc % 3 == 0 :
                self.output += 3
        print ( self.output )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = float ( sys.stdin.read ( ) )
        self.tmp_n = self.n
        self.a = 0
        for i in range ( self.n ) :
            tmp = self.n
            if tmp == 0 :
                self.tmp_n -= 1
            else :
                self.a += tmp
        self.n = self.tmp_n
        self.output = 0
        while True :
            if self.a / self.n <= self.output :
                print ( self.output )
                return
            self.output += 1

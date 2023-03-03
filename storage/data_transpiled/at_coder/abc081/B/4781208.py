def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.hako = [ ]
        self.cont = 0
        self.flag = 1
    def run ( self ) :
        while self.flag == 1 :
            for i in range ( self.a ) :
                if self.hako [ i ] % 2 == 0 :
                    self.hako [ i ] = self.hako [ i ] / 2
                else :
                    self.flag = 0
            if self.flag == 1 :
                self.cont += 1
        sys.stdout.write ( self.cont )

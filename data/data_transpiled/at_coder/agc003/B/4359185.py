def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
    def run ( self ) :
        self.total = 0
        mod = 0
        for i in range ( self.n ) :
            a = sys.stdin.read ( )
            if a != 0 :
                a += mod
            self.total += a // 2
            mod = a % 2
        print ( self.total )

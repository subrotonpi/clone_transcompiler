def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.n = len ( str ( self.s ) )
        count = 0
        for i in range ( self.n ) :
            if self.s [ i ] == 'p' :
                count += 1
        print ( self.n / 2 - count )
        self.s = sys.stdin.read ( )

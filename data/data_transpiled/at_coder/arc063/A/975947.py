def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.data = sys.stdin.read ( )
        self.count = 0
        for i in range ( 1 , len ( self.data ) ) :
            if self.data [ i - 1 ] != self.data [ i ] :
                count += 1
        print ( count )

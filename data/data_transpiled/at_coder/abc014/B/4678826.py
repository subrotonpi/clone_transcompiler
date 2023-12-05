def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
    def run ( self ) :
        ans = 0
        bin = bin.decode ( 'hex' )
        for i in range ( 0 , len ( bin ) ) :
            c = sys.stdin.read ( )
            if bin [ - 1 - i ] == '1' :
                ans += c
        print ( ans )

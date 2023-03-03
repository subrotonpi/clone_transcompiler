def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.stdin )
        s = sys.stdin.read ( )
        num = [ 0 ] * 3
        for i in range ( N ) :
            if s [ i ] == 'R' :
                num [ 0 ] += 1
            elif s [ i ] == 'G' :
                num [ 1 ] += 1
            elif s [ i ] == 'B' :
                num [ 2 ] += 1
        ans = 0
        for i in range ( 3 ) :
            ans += num [ i ] % 2
        print ( ans )

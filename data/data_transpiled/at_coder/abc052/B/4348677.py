def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
    x = 0
    max = 0
    for i in range ( N ) :
        if S [ i ] == 'I' :
            x += 1
        else :
            x -= 1
        if max < x :
            max = x
    print ( max )

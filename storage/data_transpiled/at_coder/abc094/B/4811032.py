def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
    A = np.arange ( N ).reshape ( M , X )
    count = 0
    for i in range ( M ) :
        if X > A [ i ] :
            count += 1
    print ( min ( count , M - count ) )

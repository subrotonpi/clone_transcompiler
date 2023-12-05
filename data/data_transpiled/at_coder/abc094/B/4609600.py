def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        self.x = sys.stdin.read ( )
    def run ( self ) :
        a = [ ]
        for i in range ( self.m ) :
            a.append ( i )
        num = ~ np.isfinite ( a )
        print ( min ( num , self.m - num ) )

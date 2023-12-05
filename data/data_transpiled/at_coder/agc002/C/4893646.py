def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.l = sys.stdin.read ( )
    idx = 0
    prev = sys.stdin.read ( )
    for i in range ( 1 , n ) :
        x = sys.stdin.read ( )
        if x + prev >= self.l :
            idx = i
            break
        prev = x
    if idx == 0 :
        print ( "Impossible" )
    else :
        lines = [ "Possible" ] * ( n - 1 )
        for i in range ( 1 , idx ) :
            lines [ i ] = "%d\n" % ( i )
        for i in range ( n - 1 , idx - 1 , - 1 ) :
            lines [ i ] = "%d\n" % ( i )
        lines [ idx ] = "%d\n" % ( idx )
        print ( lines )

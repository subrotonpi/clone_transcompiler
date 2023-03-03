def import import sys , StringIO , traceback
class Main ( object ) :
    def __init__ ( self ) :
        self.file = sys.stdout
        self.outfile = StringIO ( )
        self.N = self.N
        self.L = self.L
        self.T = self.T
        x = [ ]
        cw = [ self.T == 1 for _ in range ( self.N ) ]
        pos = [ int ( ( x [ i ] + ( self.T % L ) ) % L ) for i in range ( self.N ) ]
        pos.sort ( )
        cnt = 0
        for i in range ( 1 , self.N ) :
            if i != self.cw [ 0 ] :
                dis = ( ( x [ i ] - x [ 0 ] ) * ( self.cw [ 0 ] ) + self.L ) % L
                cnt = ( cnt + ( 2 * self.T + self.L - dis - 1 ) / self.L ) % N
        a = bisect.bisect ( pos , self.x )
        if self.cw [ 0 ] and a > 0 and pos [ a - 1 ] == pos [ a ] : a -= 1
        if not self.cw [ 0 ] and a < self.N - 1 and pos [ a + 1 ] == pos [ a ] : a += 1
        idx = int ( ( a + cnt * ( self.cw [ 0 ] ) + self.N ) % N )
        for i in range ( self.N ) :
            print ( pos [ ( idx + i ) % self.N ] , end = "" )

def _import ( ) : return sys.stdout.write
import os
class A ( object ) :
    def __init__ ( self , arg ) :
        self.i = arg
        self.r = r
        self.h = h
    def __repr__ ( self ) :
        return "r = %r, h = %r" % ( self.i , self.h )
    def solve ( self ) :
        test_no = self.i
        for test in range ( 1 , test_no + 1 ) :
            n = self.i
            k = self.k
            ans = 0
            p = [ P ( i , self.r , self.h ) for i in range ( n ) ]
            p.sort ( key = lambda x : x.r < x.r or x.r == x.r and x.i < x.i )
            for i in range ( k - 1 , n ) :
                q = [ p [ i ] for i in range ( i ) ]
                q.sort ( key = lambda x : x.r * x.h > x.h or x.r * x.h == x.r * x.h and x.i < x.i )
                val = 0
                for j in range ( k - 1 ) :
                    val += 2 * math.pi * q [ j ].r ** 2
                val += 2 * math.pi * p [ i ].r ** 2 + math.pi * p [ i ].r ** 2
                if val > ans :
                    ans = val
        print ( "Case #%d: %f" % ( test , ans ) )

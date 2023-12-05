def import math
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n , self.a , self.b = s.split ( ' ' )
        v = [ ]
        self.v.append ( math.log ( math.pi , self.a ) )
        self.v.sort ( )
        sum = use = count = 0
        for i in range ( self.n - a , self.n ) :
            if self.v [ self.n - a ] == self.v [ i ] :
                use += 1
                count += 1
            sum += self.v [ i ]
        print ( decimal.Decimal ( sum * 1.0 / a ).quantize ( decimal.Decimal ( '.' ) ) )
        for i in range ( self.n - a ) :
            if self.v [ self.n - a ] == self.v [ i ] :
                count += 1
        print ( count , use , file = sys.stderr )
        if self.v [ self.n - a ] == self.v [ self.n - 1 ] :
            r = 0
            for i , e in zip ( range ( 0 , self.b - a , self.count - use ) , range ( self.b - a , self.count - use ) ) :
                r += comb ( self.use , count + i )
            print ( r )
        else :
            print ( comb ( self.use , count ) )
    def comb ( self , count , use ) :
        r = 1
        for i in range ( self.use + 1 , self.count + 1 ) :
            r *= i
            r /= i - use
        return r

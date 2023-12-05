def import import sys
class Main ( object ) :
    def __init__ ( self , s ) :
        self.n , self.k = s.split ( ' ' )
    def main ( self ) :
        self.n , self.k = self.n , self.k
        x , y = [ s.split ( ' ' ) for i in range ( self.n ) ]
        res = sys.maxint
        for i in range ( self.n ) :
            for j in range ( self.i + 1 , self.n ) :
                l = min ( x [ i ] , x [ j ] )
                r = max ( x [ i ] , x [ j ] )
                for p in range ( self.n ) :
                    for q in range ( self.p + 1 , self.n ) :
                        t = min ( y [ p ] , y [ q ] )
                        b = max ( y [ p ] , y [ q ] )
                        c = 0
                        for o in range ( self.n ) :
                            if l <= x [ o ] <= r and t <= y [ o ] <= b :
                                c += 1
                        if c >= k :
                            res = min ( res , ( r - l ) * ( b - t ) )
        print ( res )

def _ _ main _ _ ( ) : return
class E ( object ) :
    def __init__ ( self , x , y ) :
        self.M = 10007
        self.M = ( x * y ) % M
        self.A = ( x + y ) % M
        self.DP [ self.key ] = self.F [ self.min_i ]
        if self.min_i >= 0 and self.A [ self.min_i ] > self.A [ self.min_i ] :
            return self.DP [ self.key ] = self.F [ self.min_i ]
        else :
            return self.DP [ self.key ] = self.F [ self.min_i ]
    def f ( self , x , y ) :
        self.T = x
        self.A = x
        self.DP = [ self.F [ self.k ] for self in x ]
        self.INV = [ self.inv ( x , y ) for x in x ]
        ans = 0
        for kill in self.kill :
            cnt = 0
            for i in self.n :
                if i in self.INV [ kill ] :
                    cnt += 1
            for i in self.DP :
                i = None
            ans = self.A [ ans ] = self.f ( - 1 , 0 , 0 , kill , cnt )
        if ans == 0 :
            ans = 1
        print ( "Case #%d: %d\n" % ( self.cas , ans ) )
    def inv ( self , i , j ) :
        return ( self.A [ i ] < A [ j ] ) or ( self.A [ i ] > A [ j ] )
    def sorted ( self , start , ignore ) :
        for i in range ( start , self.n ) :
            lo = self.i - 1 == ignore and self.i - 2 or self.i - 1
            if lo >= 0 and self.A [ i ] > A [ lo ] :
                return False
        return True

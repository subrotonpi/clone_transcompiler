def import _solve
class C ( object ) :
    def __init__ ( self , sc ) :
        self.sc = sc
        self.R , self.C = sc
        self.pair = [ ]
        self.R = None
        self.pair = [ ]
        self.R = None
        self.pair = [ ]
        self.C = None
        self.rec ( self.f , 0 )
        if self.ans is None :
            print ( "IMPOSSIBLE" )
        else :
            for i in range ( self.R ) :
                self.ans.append ( ( self.ans [ i ] , self.C ) )
    def _simulate ( self , f , r , c , d ) :
        while 0 <= r < R and 0 <= c < C :
            m = ( f [ r ] , f [ c ] ) == 0
            d ^= 1
            if not m :
                d ^= 2
            r += self.DR [ d ]
            c += self.DC [ d ]
        if r < 0 :
            return c
        if c == C :
            return C + r
        if r == R :
            return R + C + ( C - 1 - c )
        if c < 0 :
            return R + C + C + ( R - 1 - r )
        return - 1
    def _simulate ( self , f , idx ) :
        if self.ans is not None :
            return self.ans
        if idx == len ( self.f ) :
            ok = True
            for i in range ( 0 , len ( self.pair ) , 2 ) :
                if self.pair [ i ] < self.C :
                    ar = _simulate ( self.f , 0 , self.pair [ i ] , 0 )
                elif self.pair [ i ] < self.R + self.C :
                    ar = _simulate ( self.f , self.pair [ i ] - self.C , self.pair [ i ] - self.R - C , 2 )
                elif self.pair [ i ] < self.R + self.C :
                    ar = _simulate ( self.f , self.pair [ i ] - self.R - C - self.C , 0 , 1 )
                if ar
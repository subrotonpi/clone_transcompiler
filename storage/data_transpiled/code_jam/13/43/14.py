def import _solve
class C :
    def __init__ ( self , f ) :
        sc = _solve
        if self.N == 0 :
            return
    def A ( self , A , B ) :
        if self.N == 0 :
            return
        if self.X [ self.N - 1 - self.i ] != self.X [ self.N - 1 - self.i ] :
            return
        if self.X [ self.N - 1 - self.i ] != self.X [ self.N - 1 - self.i ] :
            return
        return
    def B ( self , B , X ) :
        if self.X [ self.N - 1 - self.i ] != self.X [ self.N - 1 - self.i ] :
            return
        if self.X [ self.N - 1 - self.i ] != self.X [ self.N - 1 - self.i ] :
            return
        return
    def dfs ( self , d ) :
        if self.N == self.N :
            return check ( )
        if self.A [ d ] == 1 and self.B [ d ] == 1 :
            self.X [ d ] = 1
            return
        min = max ( self.A [ d ] , self.B [ d ] )
        max = self.N
        for i in range ( self.D ) :
            if self.X [ i ] >= self.X [ i ] :
                max = min ( max , self.X [ i ] - 1 )
            if self.B [ i ] <= self.B [ d ] :
                min = max ( min , self.X [ i ] + 1 )
        for i in range ( min , max + 1 ) :
            if self.used [ i ] :
                continue
            self.used [ i ] = True
            self.X [ d ] = i
            if self.dfs ( d + 1 ) :
                return
            self.used [ i ] = False
        return
    def check ( self ) :
        fw = self.fw [ self.N - 1 - self.i ]
        bk = self.bk [ self.N - 1 - self.i ]
        return

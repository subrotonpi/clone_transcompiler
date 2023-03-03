def import _UF
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.m = 0
        self.p = [ ]
        uf = _UF ( self.n )
        for i in range ( self.n ) :
            self.p.append ( i )
    def __init__ ( self , m ) :
        for i in range ( self.m ) :
            x = _UF ( self.p [ i ] )
            y = _UF ( self.p [ i ] )
            uf.union ( x , y )
        cnt = 0
        for i in range ( self.n ) :
            if uf.same ( i , self.p [ i ] - 1 ) :
                cnt += 1
        print ( cnt )
    def __init__ ( self , s ) :
        print ( s )
    def __init__ ( self , s ) :
        print ( s )
class UF ( object ) :
    def __init__ ( self ) :
        self.table , self.ranks = [ ] , [ ]
    def find ( self , x ) :
        if self.table [ x ] != x :
            self.table [ x ] = self.find ( self.table [ x ] )
        return self.table [ x ]
    def union ( self , x , y ) :
        x_r = self.find ( x )
        y_r = self.find ( y )
        if x_r == y_r :
            return
        if self.ranks [ x_r ] < self.ranks [ y_r ] :
            self.table [ x_r ] = y_r
        else :
            self.table [ y_r ] = x_r
            if self.ranks [ x_r ] == self.ranks [ y_r ] :
                self.ranks [ x_r ] += 1
    def same ( self , x ) :
        return self.find ( x ) == self.find ( y )

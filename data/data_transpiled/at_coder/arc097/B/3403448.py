def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        p = [ sc.get ( ) for i in range ( N ) ]
        x = [ sc.get ( ) for i in range ( M ) ]
        y = [ sc.get ( ) for i in range ( M ) ]
        UnionFind.__init__ ( N )
        for i in range ( M ) :
            UnionFind.unite ( x [ i - 1 ] , y [ i - 1 ] )
        cnt = 0
        for i in range ( N ) :
            if UnionFind.same ( p [ i - 1 ] , i ) :
                cnt += 1
        print ( cnt )
class UnionFind ( object ) :
    def __init__ ( self , n ) :
        N = n
        self.par = [ ]
        self.rank = [ ]
    def find ( self , x ) :
        if self.par [ x ] == x :
            return x
        else :
            return self.par [ x ] , self.rank [ x ]
    def unite ( self , x , y ) :
        x = self.par [ x ]
        y = self.par [ y ]
        if x == y :
            return x
        if self.rank [ x ] < self.rank [ y ] :
            self.par [ x ] = y
        else :
            self.par [ y ] = x
            if self.rank [ x ] == self.rank [ y ] :
                self.rank [ x ] += 1
    def same ( self , x , y ) :
        return self.find ( x ) == self.find ( y )

def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = self.N
        self.param = [ ]
        self.rank = [ ]
        for i in range ( self.N ) :
            self.param.append ( i )
        self.rank = [ ]
    def __init__ ( self , x , y ) :
        self.__init__ ( x * y )
        self.xlen = y
    def same ( self , a , b ) :
        return self.get_root ( a ) == self.get_root ( b )
    def same ( self , x1 , y1 , x2 , y2 ) :
        return self.same ( x1 * self.xlen + y1 , x2 * self.xlen + y2 )
    def get_root ( self ) :
        if self.param [ self.a ] == self.param [ self.b ] :
            return self.param [ self.a ]
        else :
            return ( self.param [ self.a ] , self.param [ self.b ] )
    def unite ( self , a , b ) :
        a = self.get_root ( a )
        b = self.get_root ( b )
        if a == b :
            return
        if self.rank [ a ] < self.rank [ b ] :
            self.param [ self.a ] = b
        else :
            self.param [ self.b ] = a
            if self.rank [ a ] == self.rank [ b ] :
                self.rank [ a ] += 1
    def unite ( self , x1 , y1 , x2 , y2 ) :
        self.unite ( x1 * self.xlen + y1 , x2 * self.xlen + y2 )
class Main ( object ) :
    def __init__ ( self ) :
        self.N = self.N
        self.M = self.M
    uf = UnionFind ( self.N * 2 )
    Connected = [ ]
    for i in range ( self.M ) :
        u = self.U [ i ] - 1
        v = self.V [ i ] - 1
        uf.unite ( u , N + v )
        uf.unite ( N + u , v )
        Connected.
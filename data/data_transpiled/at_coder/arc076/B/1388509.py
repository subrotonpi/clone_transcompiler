def import _main
class Main ( object ) :
    def __init__ ( self , n ) :
        self.N = n
        self.param = [ ]
        self.rank = [ ]
        for i in range ( N ) :
            self.param.append ( i )
        self.rank = [ ]
        for i in range ( N - 1 ) :
            self.roads.append ( ( self.p [ i + 1 ].x , self.p [ i + 1 ].idx ) )
        self.rank = [ ]
    def __init__ ( self , x , y ) :
        self.x = x * y
        self.xlen = y
    def same ( self , a , b ) :
        return self.get_root ( a ) == self.get_root ( b )
    def same ( self , x1 , y1 , x2 , y2 ) :
        return self.same ( x1 * xlen + y1 , x2 * xlen + y2 )
    def get_root ( self ) :
        if self.param [ a ] == self.param [ b ] :
            return self.param [ a ]
        else :
            return ( self.param [ a ] , self.root )
    def unite ( self , a , b ) :
        a = self.get_root ( a )
        b = self.get_root ( b )
        if a == b :
            return
        if self.rank [ a ] < self.rank [ b ] :
            self.param [ a ] = b
        else :
            self.param [ b ] = a
            if self.rank [ a ] == self.rank [ b ] :
                self.rank [ a ] += 1
    def unite ( self , x1 , y1 , x2 , y2 ) :
        return self.unite ( x1 * xlen + y1 , x2 * xlen + y2 )
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n

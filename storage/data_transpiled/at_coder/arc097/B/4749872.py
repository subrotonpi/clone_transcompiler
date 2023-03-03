def import _union
class Pair :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
class UnionFind :
    def __init__ ( self , N ) :
        self.par = [ ]
        for i in range ( N ) :
            self.par.append ( i )
    def root ( x ) :
        if self.par [ x ] == x :
            return x
        return self.par [ x ] = root ( self.par [ x ] )
    def unite ( x , y ) :
        rx = root ( x )
        ry = root ( y )
        if rx == ry :
            return x
        self.par [ rx ] = ry
    def same ( x , y ) :
        rx = root ( x )
        ry = root ( y )
        return rx == ry
class Main ( object ) :
    def __init__ ( self , N ) :
        self.M = M
        self.p = [ ]
        self.sw = [ ]
    def __init__ ( self , p ) :
        self.p = p
        self.sw = [ ]
    def uf ( self , p ) :
        self.uf = UnionFind ( self.N + 1 )
        for s in self.sw :
            self.uf.unite ( s.x , s.y )
    def sum ( self ) :
        for i in range ( 1 , self.N + 1 ) :
            if self.uf.same ( i , p [ i ] ) :
                sum += 1
        print ( sum )

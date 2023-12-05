def import select , join
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.argv [ 1 ] )
        self.m = int ( sys.argv [ 2 ] )
        self.bridges = [ [ i - 1 , i - 1 ] for i in range ( self.m ) ]
        self.uf = UnionFind ( self.n )
        self.result = [ long ( self.n * ( self.n - 1 ) ) / 2 ]
        for a , b in zip ( self.bridges [ 0 ] , self.bridges [ 1 ] ) :
            self.result.append ( self.result [ i + 1 ] )
            if self.uf.find ( a ) == self.uf.find ( b ) :
                continue
            self.result -= long ( self.uf.size ( a ) * self.uf.size ( b ) )
            self.uf.union ( a , b )
        self.result = [ ]
        for i in range ( 1 , self.m + 1 ) :
            self.result.append ( self.result [ i ] + '\n' )
        print ( ''.join ( self.result ) )
class UnionFind ( UnionFind ) :
    def __init__ ( self , size ) :
        self.table = [ ]
        self.ranks = [ ]
        self.sizes = [ ]
        for i in range ( self.size ) :
            self.table.append ( self.table [ i ] )
            self.sizes.append ( 1 )
    def size ( self , n ) :
        return self.sizes [ self.find ( n ) ]
    def find ( self , n ) :
        if self.table [ n ] != n :
            self.table [ n ] = self.find ( self.table [ n ] )
        return self.table [ n ]
    def union ( self , x , y ) :
        x_root = self.find ( x )
        y_root = self.find ( y )
        if self.x_root == y_root :
            return self.ranks [ self.x_root ]
        return self.sizes [ self.y_root ]

def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.M = sys.maxint
        self.a = [ ]
        for i in range ( self.N ) :
            self.a.append ( sys.stdin.read ( ) )
    uf = UnionFind ( N + 1 )
    for i in range ( M ) :
        x = sys.stdin.read ( )
        y = sys.stdin.read ( )
        uf.union ( x , y )
    count = 0
    for i in range ( N ) :
        if uf.find ( i + 1 ) == uf.find ( a [ i ] ) :
            count += 1
    print ( count )
    class UnionFind ( object ) :
        def __init__ ( self ) :
            self.table = [ ]
            self.ranks = [ ]
            self.sizes = [ ]
            for i in range ( self.N ) :
                self.table.append ( i )
                self.sizes.append ( 1 )
        def find ( self , x ) :
            if self.table [ x ] != x :
                self.table [ x ] = self.find ( self.table [ x ] )
            return self.table [ x ]
        def union ( self , x , y ) :
            x_root = self.find ( x )
            y_root = self.find ( y )
            if x_root == y_root :
                return
            if self.ranks [ x_root ] < self.ranks [ y_root ] :
                tmp = x_root
                x_root , y_root = y_root , tmp
            self.table [ y_root ] = x_root
            self.sizes [ x_root ] += self.sizes [ y_root ]
            if self.ranks [ x_root ] == self.ranks [ y_root ] :
                self.ranks [ x_root ] += 1

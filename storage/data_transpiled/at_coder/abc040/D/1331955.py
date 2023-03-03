def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        edges = [ ]
        for i in range ( M ) :
            a , b , y = sc.__next__ ( )
            edges.append ( ( a , b , y ) )
        Q = sc.__next__ ( )
        queries = [ ]
        for i in range ( Q ) :
            v , y = sc.__next__ ( )
            queries.append ( ( i , v , y ) )
        unionfind = _UnionFind ( N )
        ans = [ ]
        while not queries.empty ( ) :
            query = queries.pop ( )
            while not edges.empty ( ) and edges [ - 1 ].year > query.year :
                edge = edges.pop ( )
                unionfind.unite ( edge.to , edge.from )
            ans.append ( unionfind.size ( query.to ) )
        for a in ans : print ( a )
    class UnionFind ( object ) :
        def __init__ ( self , n ) :
            self.par = [ ]
            self.sizes = [ 1 ] * n
            for i in range ( n ) :
                self.par.append ( i )
        def find ( x ) :
            if x == self.par [ x ] : return x
            return self.par [ x ]
        def unite ( self , x , y ) :
            x , y = self.par [ x ]
            if x == y : return x
            if self.sizes [ x ] < self.sizes [ y ] :
                tx , x , y = self.par [ x ] , self.par [ y ]
            self.par [ y ] = x
            self.sizes [ x ] += self.sizes [ y ]
    def same ( self , x , y ) :
        return self.par [ x ] == self.par [ y ]

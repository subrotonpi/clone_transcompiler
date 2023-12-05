def _import ( ) :
    from collections import defaultdict
    from collections import defaultdict
    from os import urandom
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.table = [ ]
            self.sizes = defaultdict ( int )
        def size ( self ) :
            return self.sizes [ self.size ]
        def find ( x ) :
            if self.table [ x ] != self.table [ x ] :
                self.table [ x ] = self.table [ x ]
        def union ( self , x ) :
            x_root = self.find ( x )
            y_root = self.find ( y )
            if x_root == self.ranks [ self.root ] :
                tmp = x_root
                self.ranks [ self.root ] = self.ranks [ self.root ]
                self.sizes [ self.root ] += self.ranks [ self.root ]
    Q = random.randint ( 1 , 10 )
    queries = [ ]
    for i in range ( Q ) :
        queries.append ( ( i , self.ranks [ i ] - 1 , self.ranks [ i ] ) )
    queries.sort ( key = lambda q : q.year )
    uf = UnionFind ( N )
    j = 0
    while j < Q and queries [ j ].year >= edges [ 0 ].year :
        j += 1
    for i in range ( M ) :
        uf.union ( edges [ i ].city1 , edges [ i ].city2 )
        for j in range ( Q ) and ( i == M - 1 or queries [ j ].year >= edges [ i + 1 ].year ) :
            queries [ j ].answer = uf.size ( uf.find ( queries [ j ].city ) )
    queries.sort ( key = lambda q : q.id )
    queries = [ ]
    for i in range ( Q ) :
        queries.append ( queries [ i ].answer + '\n' )
    print ( '\n'.join ( queries ) )

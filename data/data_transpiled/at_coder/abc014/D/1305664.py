def _ ( ) :
    import sys
    class Main ( object ) :
        def solve ( sc ) :
            N = sc.randint ( 1 , 10000 )
            adj = [ [ ] for _ in range ( N ) ]
            for _ in range ( N ) :
                adj.append ( [ ] )
            for _ in range ( N - 1 ) :
                x , y = sc.randint ( 1 , 10000 )
                adj [ x ].append ( y )
                adj [ y ].append ( x )
            lca = LCA ( adj )
            Q = sc.randint ( 1 , 10000 )
            for _ in range ( Q ) :
                x , y = sc.randint ( 1 , 10000 )
                print ( lca.getLength ( x , y ) + 1 )
    class LCA ( object ) :
        def __init__ ( self , G ) :
            self.G = G
            self.depth = [ ]
            self.root , self.log_v = 1 , 0
            self.depth = [ ]
            for u in self.G [ v ] :
                if u != self.p :
                    self.dfs ( u , v , d + 1 )
        def dfs ( self , v , p , d ) :
            self.root = v
            self.depth.append ( d )
            for u in self.G [ v ] :
                if u != self.p :
                    self.dfs ( u , v , d + 1 )
    LCA ( _ , adj )
    V = len ( adj )
    root = 0
    G = adj
    depth = [ ]
    self.depth = [ ]
    self.log_v = 1
    for i in range ( 1 , V ) :
        self.depth [ i ] *= 2
        self.depth [ i ] = - 1
    parent = [ ]
    self.dfs ( root , - 1 , 0 )
    for k in range ( self.depth [ u ] + 1 ) :
        for v in range ( self.depth [ v ] ) :
            if self.parent [ k ] [ v ] < 0 :
                self.parent [ k + 1 ] [ v ] = - 1
            else :
                self.parent [ k + 1 ] [ v ] = self.parent [ k ] [
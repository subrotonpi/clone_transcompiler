def _ _ main _ _ ( ) :
    import sys
    import os
    import getopt
    class Main ( object ) :
        def __init__ ( self ) :
            self.vis = [ ]
            self.color = [ ]
        def __init__ ( self , v , d , c ) :
            self.v = v
            self.d = d
            self.c = c
        def dfs ( u , d , c ) :
            if self.vis [ u ] [ d ] == 1 : return
            self.vis [ u ] [ d ] = 1
            if d == 0 :
                if not self.color [ u ] :
                    self.color [ u ] = c
                return
            self.dfs ( u , d - 1 , c )
            for v , c in self.graph [ u ] :
                self.dfs ( v , d - 1 , c )
        def run ( self ) :
            with open ( self.filename , 'r' ) as f :
                n , m = f.read ( ).split ( ' ' )
                self.vis = [ [ ] ] * 11
                self.color = [ ]
                self.graph = [ [ ] for _ in range ( n ) ]
                for a , b in self.graph [ m ] :
                    self.graph.append ( [ b , a ] )
    def dfs ( u , d , c ) :
        self.vis = [ ]
        self.color = [ ]
        self.graph = [ [ ] for _ in range ( n ) ]
        for v , d , c in self.graph :
            query = ( v , d , c )
            self.graph.append ( query )
        while not self.graph :
            query = self.graph.pop ( )
            dfs ( query.v , query.d , query.c )
        for c in self.color :
            print ( c )
    Note :./ Main._ _ uses _ or _ unsafe.operations.Note : Recompile ( )
    for details in Main ( ) :
        for details in details.values ( ) :
            for details in details.values ( ) :
                for details in details.values ( ) :
                    if details [ details [ details [ details [ details [ 0 ] ] ] ] == 1
def _import ( ) :
    import os
    import os
    import os
    import os
    import os
    import os
    import set
    class Main ( object ) :
        def __init__ ( self ) :
            self.white = [ ]
            self.amari = True
            self.edges = [ ]
            self.white = [ ]
            self.nibu = True
            self.left = 0
            self.right = self.N - self.left
        def bfs ( v , c ) :
            if self.white [ v ] >= 0 :
                if c % 2 != self.white [ v ] :
                    self.nibu = False
                return
            self.white [ v ] = c
            for u in self.edges [ v ] :
                self.bfs ( u , ( c + 1 ) % 2 )
    class Note :._import _core
    uses._core._import _core
    for details in _core._operations :
        self.left = 0
        self.right = self.N
    def main ( self ) :
        Scanner ( self )
        N = self.N
        M = self.M
        edge = [ [ False for arr in self.edge ] for self in self.edges ]
        while M :
            a = self.M - 1
            b = self.M - 1
            edge [ a ] [ b ] = True
            edge [ b ] [ a ] = True
        self.edges = [ ]
        self.white = [ [ False for i in self.edges ] for self in self.edges ]
        root = - 1
        seen = set ( )
        for i in self.edges :
            for j in self.edges [ i + 1 ] :
                if not self.edge [ i ] [ j ] :
                    self.edges [ i ].append ( j )
                    self.edges [ j ].append ( i )
                    seen.add ( i )
                    seen.add ( j )
        self.n = [ ]
        self.m = [ ]
        for i in self.edges :
            if i in seen and self.white [ i ] < 0 :
                self.bfs ( i , 0 )
    return Note

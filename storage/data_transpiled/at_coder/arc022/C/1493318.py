def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        self.edges = [ [ ] for _ in range ( n ) ]
        for a , b in _main ( ) :
            self.edges [ a - 1 ].append ( ( b - 1 , 1 ) )
            self.edges [ b - 1 ].append ( ( a - 1 , 1 ) )
        s = 0
        self.d = [ - 1 ] * n
        self.d [ s ] = 0
        self.max = 0
        self.maxt = - 1
        self.dfs ( s )
        self.max = self.maxt
        self.maxt = - 1
        self.dfs ( s )
        print ( "%d %d" % ( s + 1 , self.maxt + 1 ) )
    def dfs ( self ) :
        for e in self.edges :
            if self.d [ e.v ] == - 1 :
                self.d [ e.v ] = self.d [ e.w ]
                if self.d [ e.v ] > self.max :
                    self.max = self.d [ e.v ]
                    self.maxt = e.v
                self.dfs ( e.v )
    return

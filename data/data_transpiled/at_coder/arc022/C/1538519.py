def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.edges = [ ]
        self.d = [ ]
        self.max = 0
        self.maxt = - 1
    def main ( self ) :
        sc = _main ( )
        N = sc.count ( )
        self.edges = [ ]
        for i in range ( N ) :
            a = sc.randint ( - 1 , 1 )
            b = sc.randint ( - 1 , 1 )
            self.edges [ a ].append ( ( b , 1 ) )
            self.edges [ b ].append ( ( a , 1 ) )
        s = 0
        self.d = [ ]
        [ d [ s ] , d [ s ] ] = 0
        self.max = 0
        self.maxt = - 1
        dfs ( s )
        self.s = maxt
        self.d = [ ]
        self.max = 0
        self.maxt = - 1
        dfs ( s )
        print ( "%d %d" % ( s + 1 , maxt + 1 ) )
    def dfs ( self ) :
        for e in self.edges :
            if d [ e.v ] == - 1 :
                d [ e.v ] = d [ e.w ] + e.v
                if d [ e.v ] > self.max :
                    self.max = d [ e.v ]
                    self.maxt = e.v
                dfs ( e.v )
Note :./ Main.py.py.py.uses.classmethod ( or unsafe.operations.Note : Recompile.with - Xlint : classmethod ( details ) )

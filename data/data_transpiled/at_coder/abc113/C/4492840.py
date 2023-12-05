def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.N = self.N
        self.M = self.M
        self.sorted = defaultdict ( list )
        for i , P , Y in enumerate ( self.input ) :
            arr = [ P , i ]
            self.sorted [ Y ].append ( arr )
    ans = [ ]
    city = [ 0 ] * N
    for arr in self.sorted.values ( ) :
        ans.append ( "%06d%06d" % ( arr [ 0 ] , 1 ) )
        city [ arr [ 0 ] - 1 ] += 1
    for i in range ( self.M ) :
        print ( ans [ i ] )

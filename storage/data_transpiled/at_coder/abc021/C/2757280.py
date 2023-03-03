def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.a = 0
        self.b = 0
        self.q = 1000000007
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.N = self.N
        self.a = self.a - 1
        self.b = self.b - 1
        self.M = self.M
        A = [ [ 1 for x in range ( self.N ) ] for y in range ( self.M ) ]
        B = [ [ 1 for x in range ( self.M ) ] for y in range ( self.M ) ]
    def __init__ ( self ) :
        A = [ [ 1 for x in range ( self.N ) ] for y in range ( self.M ) ]
        B = [ [ 1 for x in range ( self.M ) ] for y in range ( self.M ) ]
    def __init__ ( self ) :
        C = [ [ 1 for x in range ( self.N ) ] for l in range ( self.M ) ]
        for b in range ( self.M ) :
            if B [ a ] [ b ] != 0 :
                print ( B [ a ] [ b ] )
                sys.exit ( )
            for i in range ( self.N ) :
                for j in range ( self.N ) :
                    t = 0
                    for k in range ( self.N ) :
                        t += B [ i ] [ k ] * A [ k ] [ j ]
                    t = t % q
                    C [ i ] [ j ] = t
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                B [ i ] [ j ] = C [ i ] [ j ]

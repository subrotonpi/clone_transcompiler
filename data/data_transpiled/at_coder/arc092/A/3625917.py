def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.G = [ [ 0 ] * ( 2 * N + 1 ) for i in range ( 2 * N + 1 ) ]
        self.match = [ [ 0 ] * ( 2 * N + 1 ) for i in range ( 2 * N + 1 ) ]
        self.used = [ ]
        self.R = [ [ 0 ] * ( 2 * N + 1 ) for i in range ( 2 * N + 1 ) ]
        self.B = [ [ 0 ] * ( 2 * N + 1 ) for i in range ( 2 * N + 1 ) ]
        for a , b in _main ( self.G ) :
            self.R.append ( a )
        for c , d in _main ( self.match ) :
            self.B.append ( d )
        for i in range ( 2 * N ) :
            for j in range ( i + 1 , 2 * N + 1 ) :
                if self.R [ i ] > 0 and self.R [ i ] < self.B [ j ] :
                    self.G [ i ] [ j ] = 1
                    self.G [ j ] [ i ] = 1
    self.ans = 0
    for v in range ( 1 , 2 * N + 1 ) :
        if self.match [ v ] <= 0 :
            for i in range ( 1 , 2 * N + 1 ) :
                self.used [ i ] = False
            if self.dfs ( v ) :
                self.ans += 1
    print ( self.ans )
    def dfs ( v ) :
        self.used [ v ] = True
        for i in range ( 1 , 2 * N + 1 ) :
            if self.G [ v ] [ i ] == 1 :
                u = i
                w = self.match [ u ]
                if w <= 0 or not self.used [ w ] and self.dfs ( w ) :
                    self.match [ u ] = v
                    self.match [ v ] = u
                    return True
    return False

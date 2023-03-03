def _import ( ) :
    import sys
    import os
    import os
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    class Main ( object ) :
        def __init__ ( self , x , y ) :
            self.sc = sys.stdin
            self.N = self.sc.__next__ ( )
            self.K = self.sc.__next__ ( )
            self.L = self.sc.__next__ ( )
            self.uf = UnionFindTree ( self.N )
            self.den = [ ]
            for i in range ( self.K ) :
                f = self.sc.__next__ ( )
                t = self.sc.__next__ ( )
                self.uf.unite ( f , t )
            for i in range ( self.N ) :
                self.den.append ( self.uf.find ( i ) )
            self.uf = UnionFindTree ( self.N )
            self.dou = [ ]
            for i in range ( self.L ) :
                self.dou.append ( self.uf.find ( i ) )
            self.num = { }
            self.id = [ ]
            for i in range ( self.N ) :
                self.id.append ( ( long ( self.den [ i ] ) * ( long ( self.N ) + long ( self.dou [ i ] ) ) ) )
                if self.num.has_key ( self.id ) :
                    self.num [ self.id ] = self.num [ self.id ] + 1
                else :
                    self.num [ self.id ] = 1
            for i in range ( self.N ) :
                if i < self.N - 1 :
                    self.p ( self.num [ self.id ] + " " )
                else :
                    self.p ( self.num [ self.id ] )
    return Main ( )

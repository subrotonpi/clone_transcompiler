def main ( ) :
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = 0
            self.M = 0
            self.a = [ ]
            self.b = [ ]
            self.y = [ ]
            self.Q = 0
            self.v = [ ]
            self.count = [ ]
        def root ( self ) :
            if self.par [ self.x ] == self.par [ self.y ] :
                return self.par [ self.x ]
            else :
                return self.par [ self.x ]
        def unite ( self , x , y ) :
            self.a = [ ]
            self.b = [ ]
            for i in range ( self.M ) :
                self.a.append ( self.par [ i ] )
                self.b.append ( self.par [ i ] )
                self.y.append ( self.par [ i ] )
                self.route [ i ] = ( self.a , self.b , self.y )
            self.route = [ ]
            self.Q = self.q
            p = [ ]
            v = [ ]
            w = [ ]
            for i in range ( self.Q + 1 ) :
                self.v.append ( self.par [ i ] )
                self.w.append ( self.par [ i ] )
                p.append ( ( self.v [ i ] , self.w [ i ] , i ) )
            self.p = [ ]
            unionfind = UnionFind ( self.N )
            self.count = [ ]
            j = 0
            for i in range ( self.Q ) :
                while self.route [ j ].year > self.p [ i ].year :
                    unionfind.unite ( self.route [ j ].a , self.route [ j ].b )
                    if j < self.M - 1 :
                        j += 1
                    if j == self.M - 1 :
                        break
                self.count.append ( self.p [ i ].id )
    return Main ( )

def _import ( ) :
    import random
    import sys
    class TheGardenerOfSevilleSmall ( object ) :
        class DSU ( object ) :
            def __init__ ( self , n ) :
                self.n = n
                self.p = [ ]
                for i in range ( n ) :
                    self.p.append ( i )
            def get ( v ) :
                return v == self.p [ v ]
            def unite ( v1 , v2 ) :
                if rnd.random ( ) :
                    self.p [ v1 ] = self.p [ v2 ]
                else :
                    self.p [ v2 ] = self.p [ v1 ]
        def to_vertex ( r , c , byrow , bycol , x ) :
            x -= 1
            if x < c :
                return bycol [ x ] [ 0 ]
            x -= c
            if x < r :
                return byrow [ x ] [ - 1 ]
            x -= r
            if x < c :
                return bycol [ c - x - 1 ] [ - 1 ]
            x -= c
            return byrow [ r - x - 1 ] [ 0 ]
        def solve ( r , c , a ) :
            n = r * c
            byrow = [ ]
            bycol = [ ]
            total = 0
            for i in range ( r ) :
                for j in range ( c ) :
                    index = i * c + j
                    if mask & ( 1 << index ) :
                        return dsu.unite ( bycol [ j ] [ i ] , byrow [ i ] [ j ] )
                        total += 1
                for i in range ( c ) :
                    for j in range ( c ) :
                        if mask & ( 1 << index ) :
                            return dsu.unite ( bycol [ j ] [ i ] , byrow [ i ] [ j ] )
                            total += 1
            return 'IMPOSSIBLE'
    return TheGardenerOfSevilleSmall

def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.readInt ( )
            M = sc.readInt ( )
            S = sc.readInt ( )
            map = [ ]
            for i in range ( 0 , N + 1 ) :
                map.append ( [ ] )
            for i in range ( 1 , M + 1 ) :
                u , v = sc.readInt ( )
                a = min ( u , v )
                b = max ( u , v )
                map [ a ].append ( b )
            res = [ ]
            uf = UnionFind ( N )
            for i in range ( N , 1 , - 1 ) :
                for w in map [ i ] :
                    uf.union ( i , w )
                res.append ( uf.connected ( S , i ) )
            for i in range ( 1 , N + 1 ) :
                if res [ i ] : print ( i )
    class UnionFind ( object ) :
        def __init__ ( self ) :
            self.id = [ ]
            self.cnt = N
            self.size = [ ]
        def count ( self ) :
            return self.cnt
        def connected ( self , p , q ) :
            return self.find ( p ) == self.find ( q )
        def unionFind ( self , n ) :
            self.N = n
            self.id = [ ]
            self.cnt = N
            self.size = [ ]
            for i in range ( 1 , N + 1 ) :
                self.id.append ( i )
                self.size.append ( 1 )
            return self.cnt
        def find ( self ) :
            ans = self.p
            while self.id [ ans ] != ans :
                self.id [ ans ] = self.id [ ans ]
                self.ans = self.id [ ans ]
            return ans
        def union ( self , p , q ) :
            i = self.find ( p )
            j = self.find ( q )
            if i == j : return
            if self.size [ i ] < self.size [ j ] :
                self.id [ i ] = self.id [ j ]
                self.
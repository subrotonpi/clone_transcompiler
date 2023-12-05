def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            num = sc.readline ( )
            uf = UnionFind ( num )
            num_edge = sc.readline ( ).split ( ) [ 2 ]
            edge = [ [ ] for i in range ( num_edge ) ]
            ans = [ ]
            ans.append ( long ( num * ( num - 1 ) ) / 2 )
            for i in range ( num_edge - 1 , - 1 , - 1 ) :
                ans.append ( ans [ i + 1 ] )
                if not uf.same ( edge [ i ] [ 0 ] , edge [ i ] [ 1 ] ) :
                    ans [ i ] -= long ( uf.size ( edge [ i ] [ 0 ] ) * uf.size ( edge [ i ] [ 1 ] ) )
                    uf.unite ( edge [ i ] [ 0 ] , edge [ i ] [ 1 ] )
            for i in range ( 1 , num_edge + 1 ) :
                print ( ans [ i ] )
    class UnionFind ( object ) :
        def __init__ ( self , num ) :
            self.parent = [ ]
            self.size = [ ]
            for i in range ( num ) :
                self.init_node ( i )
        def init_node ( self , i ) :
            self.parent.append ( i )
            self.size.append ( 1 )
        def unite ( self , x , y ) :
            x_root = self.get_root ( x )
            y_root = self.get_root ( y )
            if self.size [ y_root ] > self.size [ x_root ] :
                self.parent [ x_root ] = y_root
                self.size [ y_root ] += self.size [ x_root ]
            else :
                self.parent [ y_root ] = x_root
                self.size [ x_root ] += self.size [ y_root ]
        def get_size ( self ) :
            return self.size [ self.get_root ( x ) ]
        def get_root ( self ) :
            if self.parent != self.parent :
                self.parent = self.parent [ 0 ]
                self.size [ self.size [ 0 ] ] = self.size [
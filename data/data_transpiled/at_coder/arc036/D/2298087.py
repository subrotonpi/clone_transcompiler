def UnionFind ( size ) :
    class UnionFind ( object ) :
        def __init__ ( self , size ) :
            self.table = [ ]
            self.rank = [ ]
            for i in range ( size ) :
                self.table.append ( i )
                self.rank.append ( 1 )
        def isSame ( self , node1 ) :
            return self.find ( node1 ) == self.find ( node2 )
        def find ( self , node ) :
            if self.table [ node ] == self.node :
                return self.node
            else :
                return self.table [ node ] = self.find ( self.table [ node ] )
        def union ( self , node1 ) :
            root1 = self.find ( node1 )
            root2 = self.find ( node2 )
            if self.rank [ root1 ] < self.rank [ root2 ] :
                self.table [ root1 ] = self.root2
            elif self.rank [ root1 ] > self.rank [ root2 ] :
                self.table [ root2 ] = self.root1
                self.rank [ root1 ] += 1
    class Main ( object ) :
        def solve ( self ) :
            n = self.ni ( )
            q = self.ni ( )
            uf = UnionFind ( n * 2 )
            for i in range ( q ) :
                w = self.ni ( )
                x = self.ni ( ) - 1
                y = self.ni ( ) - 1
                z = self.ni ( )
                if w == 1 :
                    if z % 2 == 0 :
                        uf.union ( x , y )
                        uf.union ( x + n , y + n )
                    else :
                        uf.union ( x + n , y )
                        uf.union ( x , y + n )
                else :
                    print ( uf.isSame ( x , y ) and "YES" or "NO" )

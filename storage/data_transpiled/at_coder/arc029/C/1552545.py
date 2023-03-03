def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        list = [ ]
        N , M = sc.split ( ' ' )
        for i , c in enumerate ( sc.split ( ' ' ) ) :
            list.append ( ( i , N , c ) )
        for i , a , b , r in enumerate ( sc.split ( ' ' ) ) :
            list.append ( ( a , b , r ) )
        list.sort ( )
        uf = UnionFind ( N + 1 )
        ans = 0
        for i , e in list :
            if not uf.is_connected ( e.from_node , e.to_node ) :
                uf.union ( e.from_node , e.to_node )
                ans += e.cost
        print ( ans )
    class UnionFind ( object ) :
        def __init__ ( self , size ) :
            self.parent = [ ]
            [ parent ] = - 1
        def union ( self , x , y ) :
            x = self.root ( x )
            y = self.root ( y )
            if x != y :
                if self.parent [ y ] < self.parent [ x ] :
                    tmp = self.y
                    self.parent [ y ] = x
                    self.parent [ x ] = tmp
                self.parent [ x ] += self.parent [ y ]
                self.parent [ y ] = x
                return True
            return False
        def is_connected ( self , x , y ) :
            return self.root ( x ) == self.root ( y )
        def root ( self , x ) :
            return self.parent [ x ] < 0
        def size ( self , x ) :
            return - self.parent [ x ]
    class Edge ( object ) :
        def __init__ ( self ) :
            self.from_node , self.to_node , self.cost = self.cost
        def __init__ ( self ) :
            self.from_node , self.to_node , self.cost = self.cost
        def __init__ ( self ) :
            self.from_node , self.to_node , self.cost = self.cost

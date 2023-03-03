def import _solve
class Main ( object ) :
    def __init__ ( self , a ) :
        Solver.__init__ ( self , a )
    def __init__ ( self , a ) :
        super ( Main , self ).__init__ ( a )
    def __init__ ( self , b ) :
        if not self.find ( a , b ) :
            root_a = self.root ( b )
            self.nums [ root_a ] = self.root ( b )
    def find ( a , b ) :
        dist_a = self.root ( b )
        return dist_a == self.dist_b
    class Solver ( object ) :
        def __init__ ( self , a ) :
            self.nums = [ ]
        def solve ( self , b ) :
            split = self.split_int ( b )
            N , M , S = split
            neighbors = [ ]
            for i in range ( N + 1 ) :
                neighbors.append ( list ( ) )
            for i in range ( M ) :
                split = self.split_int ( b )
                u , v = split
                neighbors [ min ( u , v ) ].append ( max ( u , v ) )
            result = list ( )
            uf = UnionFind ( N + 1 )
            for i in range ( N , - 1 , - 1 ) :
                for u in neighbors [ i ] :
                    uf.union ( u , i )
                if uf.find ( i , S ) :
                    result.append ( i )
            result.sort ( )
            for i in result :
                print ( i )
        def split_int ( self ) :
            split = self.split ( )
            return [ int ( x ) for x in split ]
        def split_long ( self ) :
            split = self.split ( )
            return [ long ( x ) for x in split ]
    def solve ( self , a ) :
        if a == a :
            return a
        root = root ( a )
        return root
    def union ( self , a ) :
        if not self.find ( a , b ) :
            return root ( a )
        root = root ( a )
        return root
    def find ( self , a ) :
        return self.find ( a , a )
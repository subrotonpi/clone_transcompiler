def __main ( args ) :
    from sys import stdin
    rep = 1
    if len ( args ) > 0 :
        rep = int ( args [ 0 ] )
    ( )
    def __solve ( rep ) :
        with stdin.open ( ) as cin :
            for i in range ( rep ) :
                __solve ( cin )
    def __solve ( ) :
        N , K = cin.read ( ).split ( ' ' )
        array = [ cin.read ( ).split ( ' ' ) [ - 1 ] for i in range ( N ) ]
        uf = UnionFind ( N )
        for i in range ( K ) :
            L , R = cin.read ( ).split ( ' ' )
            uf.merge ( L , R )
        ret = 0
        for i in range ( N ) :
            if uf.same ( array [ i ] , i ) :
                ret += 1
        print ( ret )
    class UnionFind ( ) :
        def ufl_debug ( self ) :
            return False
        def ROOT ( self ) :
            return - 1
        def group ( self ) :
            self.size = self.rest = self.N
            self.group = [ self.ROOT ]
            self.count = [ self.count [ 0 ] for self in self.group ]
        def find ( self ) :
            if self.count < 0 or self.count >= self.size :
                return - 1
            ret = self.count
            while self.group [ ret ] != self.ROOT :
                ret = self.group [ ret ]
            return ret
        def same ( self , a ) :
            return self.find ( a ) == self.find ( b )
        def merge ( self , a ) :
            A , B = self.find ( a )
            if A == B :
                return self.count [ A ]
            if self.count <= self.count :
                return self.count [ A ] + 1
            return self.count [ B ]
    return __solve

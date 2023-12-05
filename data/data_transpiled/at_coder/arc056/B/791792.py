def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self , n ) :
        self.N = n
        self.param = [ ]
        self.rank = [ ]
        for i in range ( N ) :
            self.param.append ( i )
        self.rank = [ ]
    def __init__ ( self , x , y ) :
        self.__init__ ( x * y )
        self.xlen = y
    def same ( a , b ) :
        return self.getRoot ( a ) == self.getRoot ( b )
    def getRoot ( a ) :
        if self.param [ a ] == a :
            return a
        else :
            return ( self.param [ a ] , self.getRoot ( self.param [ b ] ) )
    def unite ( a , b ) :
        a , b = self.getRoot ( a ) , self.getRoot ( b )
        if a == b :
            return
        if self.rank [ a ] < self.rank [ b ] :
            self.param [ a ] = b
        else :
            self.param [ b ] = a
            if self.rank [ a ] == self.rank [ b ] :
                self.rank [ a ] += 1
    def main ( self ) :
        sc = _import ( )
        pw = _import ( "" , "" )
        N , M , S = sc.regs [ 0 ]
        lst = [ [ ] for i in range ( N ) ]
        for u , v in zip ( range ( M ) , range ( M ) ) :
            lst [ u ].append ( v )
            lst [ v ].append ( u )
    uf = UnionFind ( N + 1 )
    uf.unite ( N , S )
    ans = [ ]
    for i in range ( N - 1 , - 1 , - 1 ) :
        for j in lst [ i ] :
            if j > i :
                uf.unite ( i , j )
            if uf.same ( N , i ) :
                ans.append ( True )

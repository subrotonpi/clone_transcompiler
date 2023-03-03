def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        M = sc.count ( )
        uf = UnionFind ( N )
        uf.__init__ ( N )
        for i in range ( M ) :
            a = sc.get ( i ) - 1
            b = sc.get ( i ) - 1
            uf.unite ( a , b )
        for i in uf.find ( ) :
            i
        used = [ False ] * N
        ans = - 1
        for i in uf.find ( ) :
            if i not in used :
                used [ i ] = True
                ans += 1
        print ( ans )
class UnionFind ( object ) :
    def __init__ ( self , MAX_SIZE ) :
        self.parent = [ ]
        self.rank = [ ]
    def __init__ ( self , n ) :
        for i in range ( n ) :
            self.parent.append ( i )
            self.rank.append ( 0 )
    def find ( self , x ) :
        if self.parent [ x ] == x :
            return x
        else :
            return self.parent [ x ] = self.find ( self.parent [ x ] )
    def unite ( self , x , y ) :
        x = self.find ( x )
        y = self.find ( y )
        if x == y :
            return x
        if self.rank [ x ] < self.rank [ y ] :
            self.parent [ x ] = y
        else :
            self.parent [ y ] = x
        if self.rank [ x ] == self.rank [ y ] :
            self.rank [ x ] += 1
    def same ( self , x , y ) :
        return self.find ( x ) == self.find ( y )

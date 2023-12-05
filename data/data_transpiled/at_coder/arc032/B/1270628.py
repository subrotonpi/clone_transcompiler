def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        M = sc.readline ( )
        uf = UnionFind ( N )
        for i in range ( M ) :
            a = sc.readline ( ).strip ( )
            b = sc.readline ( ).strip ( )
            uf.union ( a , b )
        print ( uf.count ( N ) - 1 )
    def __init__ ( self , n ) :
        self.parent = [ ]
        self.rank = [ ]
    def same ( self , x ) :
        return self.find ( x ) == self.find ( y )
    def find ( self , x ) :
        if self.parent [ x ] == x :
            return x
        else :
            return self.parent [ x ] = self.find ( self.parent [ x ] )
    def union ( self , x , y ) :
        x = self.find ( x )
        y = self.find ( y )
        if x != y :
            if self.rank [ x ] > self.rank [ y ] :
                self.parent [ y ] = x
            else :
                self.parent [ x ] = y
                if self.rank [ x ] == self.rank [ y ] :
                    self.rank [ y ] += 1
        return self.parent [ x ]
    def count ( self ) :
        ret = 0
        for i in range ( self.count ) :
            if i == self.find ( i ) :
                ret += 1
        return ret

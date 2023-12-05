def import _union
import sys
class Main ( object ) :
    def __init__ ( self ) :
        perm = [ ]
        class UnionFind ( UnionFind ) :
            def __init__ ( self ) :
                self.perm = perm
        def __repr__ ( self ) :
            return "Union Find"
        def __init__ ( self ) :
            self.perm = perm
    count = 0
    with open ( "/proc/" , "r" ) as f :
        permMax = int ( f.read ( ) )
        unionFind = UnionFind ( permMax )
        pairMax = int ( f.read ( ) )
        for i in range ( permMax ) :
            perm.append ( int ( f.read ( ) ) )
        for i in range ( pairMax ) :
            x = int ( f.read ( ) ) - 1
            y = int ( f.read ( ) ) - 1
            unionFind.union ( x , y )
        for x , value in zip ( perm , range ( len ( perm ) ) ) :
            if value == perm [ x ] :
                count += 1
                continue
            if unionFind.same ( x , perm [ x ] - 1 ) :
                count += 1
                continue
        print ( count )
class UnionFind ( UnionFind ) :
    def __init__ ( self , size ) :
        self.par = [ ]
        self.rank = [ ]
    def find ( self ) :
        self.par = [ ]
        self.rank = [ ]
    def union ( self , x , y ) :
        root_x = self.par [ x ]
        root_y = self.par [ y ]
        if root_x == root_y :
            return x
        if self.rank [ root_x ] > self.rank [ root_y ] :
            self.par [ root_y ] = root_x
        else :
            self.par [ root_x ] = root_y
            if self.rank [ root_x ] == self.rank [ root_y ] :
                self.rank [ root_y ] += 1
    def same ( self , x , y ) :
        root_x = self.par [ x ]
        root_y = self.par [ y ]
        return x

def import _union
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        M = sc.readline ( ).strip ( )
        utf = UnionFind ( N )
        for i in range ( M ) :
            a = sc.readline ( ).strip ( ) - 1
            b = sc.readline ( ).strip ( ) - 1
            utf.union ( a , b )
        print ( utf.count ( N ) - 1 )
    class UnionFind ( object ) :
        def __init__ ( self , n ) :
            self.parent = [ ]
            self.rank = [ ]
            for i in range ( n ) :
                self.parent.append ( i )
                self.rank.append ( 0 )
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
        def count ( self , n ) :
            ret = 0
            for i in range ( n ) :
                if i == self.find ( i ) :
                    ret += 1
            return ret
return Main

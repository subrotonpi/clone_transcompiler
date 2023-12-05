def import find_tree
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        uft = UnionFindTree ( n )
        for i in range ( m ) :
            a = sc.readline ( ).strip ( )
            b = sc.readline ( ).strip ( )
            uft.union ( a - 1 , b - 1 )
        print ( uft.count_block ( ) - 1 )
    class UnionFindTree ( object ) :
        def __init__ ( self , size ) :
            self.parent = [ ]
            self.rank = [ ]
            for i in range ( size ) :
                self.parent.append ( i )
        def find ( self , x ) :
            if self.parent [ x ] == x :
                return x
            else :
                v = self.find ( self.parent [ x ] )
                self.parent.append ( v )
                return v
        def same ( self , x , y ) :
            return self.find ( x ) == self.find ( y )
        def union ( self , x , y ) :
            root_x = self.find ( x )
            root_y = self.find ( y )
            if self.rank [ root_x ] > self.rank [ root_y ] :
                self.parent.append ( root_x )
            elif self.rank [ root_x ] < self.rank [ root_y ] :
                self.parent.append ( root_y )
            elif root_x != self.root_y :
                self.parent.append ( root_y )
                self.rank [ root_x ] += 1
        def count_block ( self ) :
            count = 0
            for i in self.parent :
                if i == i :
                    count += 1
            return count
return Main

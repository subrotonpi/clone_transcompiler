def import _main
class Main ( object ) :
    def __init__ ( self , n ) :
        self.parent = [ ]
        self.rank = [ ]
        for i in range ( n ) :
            self.parent.append ( i )
            self.rank.append ( 1 )
    def find ( x ) :
        if self.parent [ x ] == x :
            return x
        return self.parent [ x ] = self.find ( x )
    def same ( x , y ) :
        return self.find ( x ) == self.find ( y )
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
        return self
    def main ( self ) :
        with open ( "/proc/sys/exit.stdin" , "r" ) as f :
            N = f.readline ( ).strip ( )
            M = f.readline ( ).strip ( )
            S = f.readline ( ).strip ( )
            g = [ [ ] for i in range ( N ) ]
            for a in range ( 1 , M + 1 ) :
                b = f.readline ( ).strip ( )
                g [ a ].append ( b )
                g [ b ].append ( a )
            uft = UnionFind ( N )
            ans = [ ]
            for u in range ( N - 1 , - 1 , - 1 ) :
                for j in g [ u ] :
                    if j > u :
                        uft.union ( u , j )
                    if uft.same ( u , S ) :
                        ans.append ( u + 1 )
            for i in ans [ : - 1 ] :
                print ( ans [ i ] )
    Note :./ main.py.uses.unsafe.operations.Note : Recompile - with - Xlint :

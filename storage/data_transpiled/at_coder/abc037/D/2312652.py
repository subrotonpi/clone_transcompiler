def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.compute = sys.stdin
    def compute ( self ) :
        self.scan = sys.stdin.readline ( )
        h , w = self.scan.split ( ' ' )
        a = [ [ int ( i ) for i in self.scan.split ( ' ' ) ] for j in self.scan.split ( ' ' ) ]
        partcount = [ [ ] for _ in range ( h ) ]
        for m in range ( h ) :
            for n in range ( w ) :
                self.dfs ( m , n )
                self.partcount.append ( partcount [ m ] [ n ] )
                self.partcount [ m ] [ n ] %= mod
        print ( self.partcount )
    def dfs ( x , y ) :
        if partcount [ x ] [ y ] == 0 :
            if x > 0 and a [ x - 1 ] [ y ] > a [ x ] [ y ] :
                self.dfs ( x - 1 , y )
                self.partcount [ x ] [ y ] += self.partcount [ x - 1 ] [ y ]
                self.partcount [ x ] [ y ] %= mod
            if y > 0 and a [ x ] [ y - 1 ] > a [ x ] [ y ] :
                self.dfs ( x , y - 1 )
                self.partcount [ x ] [ y ] += self.partcount [ x ] [ y - 1 ]
                self.partcount [ x ] [ y ] %= mod
            if x < h - 1 and a [ x + 1 ] [ y ] > a [ x ] [ y ] :
                self.dfs ( x + 1 , y )
                self.partcount [ x ] [ y ] += self.partcount [ x + 1 ] [ y ]
                self.partcount [ x ] [ y ] %= mod

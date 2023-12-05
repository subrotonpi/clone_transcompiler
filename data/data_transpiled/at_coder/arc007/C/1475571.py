def import _search
class Main ( object ) :
    def __init__ ( self ) :
        self.al = [ ]
    def search ( self ) :
        f = True
        for i in self.n : f = ( f and self.t [ i ] )
        if f : return 0
        min = self.n
        for i in self.n :
            if not self.al [ i ] :
                self.al [ i ] = True
                for j in self.n : t [ j ] += ( 1 if self.c [ ( j + i ) % self.n ] else 0 )
                min = min ( min , self.search ( ) + 1 )
                for j in self.n : t [ j ] -= ( 1 if self.c [ ( j + i ) % self.n ] else 0 )
                self.al [ i ] = False
        return min
    def main ( self ) :
        cin = sys.stdin.readline ( )
        n = len ( cin )
        self.c = [ ]
        self.t = [ ]
        self.al = [ ]
        for i in range ( n ) :
            self.c.append ( ( cin [ i ] == 'o' ) )
            self.al.append ( False )
            self.t.append ( 0 )
        print ( self.search ( ) )

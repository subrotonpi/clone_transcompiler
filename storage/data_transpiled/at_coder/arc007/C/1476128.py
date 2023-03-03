def import _main
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
                for j in range ( self.n ) : t [ j ] += ( 1 if self.c [ ( j + i ) % self.n ] else 0 )
                min = min ( min , self.search ( ) + 1 )
                for j in range ( self.n ) : t [ j ] -= ( 1 if self.c [ ( j + i ) % self.n ] else 0 )
                self.al [ i ] = False
        return min
    def main ( self ) :
        cin = sys.stdin.readline ( )
        n = len ( cin )
        self.c = [ ]
        self.t = [ ]
        self.al = [ ]
        for i in range ( self.n ) :
            self.c.append ( self.t [ i ] = ( cin [ i ] == 'o' ) )
        self.al.append ( True )
        print ( self.search ( ) + 1 )

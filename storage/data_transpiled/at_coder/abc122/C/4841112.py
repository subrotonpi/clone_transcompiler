def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.q = int ( self.q )
        s = self.s
        t = [ 0 ] * ( n + 1 )
        i = 0
        for i in range ( 1 , n ) :
            t [ i ] = t [ i - 1 ] + ( 1 if ( s [ i - 1 ] == 'A' and s [ i ] == 'C' ) else 0 )
        t [ i ] = t [ i - 1 ]
    def main ( self ) :
        for i in range ( self.q ) :
            l = _main ( self )
            r = _main ( self )
            print ( t [ r - 1 ] - t [ l - 1 ] )

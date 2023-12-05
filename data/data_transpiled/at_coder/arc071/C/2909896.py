def import _main
class Main ( object ) :
    class Query ( object ) :
        def __init__ ( self , a , b , c , d ) :
            self.a = a
            self.b = b
            self.c = c
            self.d = d
    def main ( sc ) :
        s = sc.choice ( s )
        t = sc.choice ( t )
        q = sc.choice ( q )
        data = [ ( s [ i ] , t [ i ] , t [ i ] ) for i in range ( q ) ]
        sums = [ ( sums [ i ] + ( s [ i ] == 'A' and 1 or 2 ) ) % 3 for i in range ( q ) ]
        sumt = [ ( sumt [ i ] + ( t [ i ] == 'A' and 1 or 2 ) ) % 3 for i in range ( q ) ]
        a , b , c , d = sums [ data [ i ] [ 0 ] - 1 ] , sums [ data [ i ] [ 1 ] - 1 ] , sumt [ data [ i ] [ 2 ] - 1 ] , sumt [ data [ i ] [ 3 ] - 1 ] , sumt [ data [ i ] [ 4 ] - 1 ] ]
        print ( ( ( 3 + b - a ) % 3 == ( 3 + d - c ) % 3 ) and 'YES' or 'NO' )

def import _main
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.MOD = MOD
    def __call__ ( self , * args ) :
        sc = _main ( args )
        h , w , ans , x = sc.regs [ 0 ]
        c = [ [ ] for i in range ( 10 ) for j in range ( 10 ) ]
        for k in range ( 10 ) :
            for i in range ( 10 ) :
                for j in range ( 10 ) :
                    c [ i ] [ j ] = min ( c [ i ] [ j ] , c [ i ] [ k ] + c [ k ] [ j ] )
        for i in range ( h ) :
            for j in range ( w ) :
                if ( x ) :
                    ans += c [ x ] [ 1 ]
        print ( ans )

def _import ( * args ) : return _import ( None , sys.stdout , '' , os.getpid ( ) )
class Main ( object ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
    def solve ( self , n , m , cost , idol , p ) :
        e = [ ]
        e.append ( 1 << 60 )
        e.append ( 0 )
        for s in range ( 1 << n ) :
            for j in range ( m ) :
                a = resp = 0
                for k in idol [ j ] :
                    if s & ( 1 << idol [ j ] [ k ] ) :
                        ns = s ^ ( 1 << idol [ j ] [ k ] )
                        a += e [ ns ] * p [ j ] [ k ]
                    else :
                        resp += p [ j ] [ k ]
                if resp < 0.999 :
                    e [ s ] = min ( e [ s ] , ( cost [ j ] + a ) / ( 1 - resp ) )
        print ( e [ ( 1 << n ) - 1 ] )
    def run ( self ) :
        sc = _raw_input ( )
        n , m , c , cost , idol , p = sc.__next__ ( )
        for i in range ( m ) :
            c [ i ] = sc.__next__ ( )
            cost [ i ] = sc.__next__ ( )
            idol [ i ] = [ sc.__next__ ( ) ]
            p [ i ] = [ sc.nextDouble ( ) * 0.01 ]

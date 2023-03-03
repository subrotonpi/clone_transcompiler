def tr ( * args ) : return [ None , '' , '' , os.getpid ( ) ]
class Main ( object ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
        self.args = args
    def solve ( self , n , m , cost , idol , p ) :
        e = [ 1 << 60 ] * n
        e [ 0 ] = 0
        for i in range ( 1 , n + 1 ) :
            for s in range ( 1 << n ) :
                if int ( s ) != i :
                    continue
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
        sc = sys.stdin
        n , m , c , cost , idol , p = sc.scan ( )
        for i in range ( m ) :
            self.c [ i ] = sc.randint ( 0 , 1 << n )
            self.cost [ i ] = sc.randint ( 0 , 1 << n )
            self.idol [ i ] = [ ]
            self.p [ i ] = [ ]

def _import ( ) :
    from numpy import zeros , pi
    class Main ( object ) :
        def __init__ ( self ) :
            self.p = zeros ( ( 2 , 6 ) )
        def run ( self ) :
            sc = pi.copy ( )
            self.N = sc.n
            self.K = sc.n
            x = zeros ( N )
            y = zeros ( N )
            for i in range ( N ) :
                x [ i ] = sc.n % ( 2 * K )
                y [ i ] = sc.n % ( 2 * K )
                if sc.name == 'W' :
                    y [ i ] += K
                    y [ i ] %= 2 * K
                p = pos ( x [ i ] , y [ i ] , K )
                x [ i ] = p [ 0 ]
                y [ i ] = p [ 1 ]
    def tr ( * args ) :
        print ( [ x , y ] )
    def main ( * args ) :
        with Trace ( ) as Trace :
            args = [ args ]
            for i in range ( N ) :
                Trace.trace ( args [ i ] )

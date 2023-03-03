def _import ( * args , ** kwargs ) :
    from numpy import random
    from numpy import array , array , float64
    class A :
        def read ( ) :
            A , B = random.randint ( 1 , A ) , random.randint ( 1 , B )
            ps = array ( [ random.uniform ( 0 , A ) for i in range ( A ) ] )
            return A , B
        def solve ( ) :
            min = 1 + B + 1
            correct = [ 1 ] * A + [ B ]
            for i in range ( A + 1 ) :
                correct [ i + 1 ] = correct [ i ] * ps [ i ]
            for i in range ( 0 , A ) :
                min = min ( min , ( ( A - i ) + ( B - i ) + 1 ) + ( 1 - correct [ i ] ) * ( B + 1 ) )
            print ( "%.10f" % min )
        def run ( ) :
            caseN = random.randint ( 1 , A + 1 )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( )
                print ( "Case #%d: " % caseID )
                solve ( )
                sys.stdout.flush ( )
    def debug ( * args , ** kwargs ) :
        print ( deeprepr ( args , kwargs ) , file = sys.stderr )
    def main ( ) :
        with open ( args [ 0 ] if args else ( A + ".in" ) ) as f :
            with open ( args [ 0 ] if args else ( A + ".in" ) ) as f :
                return f.read ( )
    return main

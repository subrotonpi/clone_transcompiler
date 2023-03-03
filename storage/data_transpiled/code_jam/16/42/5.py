def _import ( * args ) :
    from numpy import sort
    class B ( object ) :
        def read ( self ) :
            N , K = args
            ps = [ self._number ( ) for _ in range ( N ) ]
            sort ( ps )
        def f ( ps ) :
            n = len ( ps )
            dp = [ [ 1 ] * n + [ 0 ] for _ in range ( n + 1 ) ]
            dp [ 0 ] [ 0 ] = 1
            for i in range ( n ) :
                for j in range ( 0 , n ) :
                    if j + 1 <= n :
                        dp [ i + 1 ] [ j + 1 ] += dp [ i ] [ j ] * ps [ i ]
                    dp [ i + 1 ] [ j ] += dp [ i ] [ j ] * ( 1 - ps [ i ] )
            return dp [ n ] [ n / 2 ]
        def solve ( self ) :
            res = 0
            for i in range ( 0 , K ) :
                qs = [ ps [ j ] for j in range ( K - i ) ]
                for j in range ( N - i ) :
                    qs [ i + j ] = ps [ N - 1 - j ]
                res = max ( res , f ( qs ) )
            print ( "%.10f" % ( res ) )
        def run ( self ) :
            caseN = len ( self._number )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( self )
                print ( "Case #%d: " % caseID )
                solve ( self )
                sys.stdout.flush ( )
    def debug ( * args ) :
        print ( deeprepr ( args ) , file = sys.stderr )
    def main ( ) :
        try :
            sys.stdin = open ( "%s.in" % sys.argv [ 0 ] )
        except :
            pass
    return B ( )

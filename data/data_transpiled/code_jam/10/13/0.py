def _import ( * args , ** kwargs ) :
    from time import time
    import sys
    class C :
        TIME = False
        def solve ( self ) :
            A1 , A2 = args [ 0 ] , args [ 1 ]
            B1 , B2 = args [ 2 ] , args [ 3 ]
            res = 0
            for b in range ( B1 , B2 + 1 ) :
                min = int ( ceil ( 1.0 / R * b ) )
                max = int ( floor ( R * b ) )
                min = max ( min , A1 )
                max = min ( max , A2 )
                res += A2 - A1 + 1
                if min <= max :
                    res -= max - min + 1
            print ( res )
    R = ( sqrt ( 5 ) + 1 ) / 2
    def run ( ) :
        time = time ( )
        sc = args [ 0 ]
        on = sc.next ( )
        for o in range ( 1 , on + 1 ) :
            t = ( time ( ) - time ( ) ) * 1e-3
            if TIME :
                sys.stderr.write ( "%03d/%03d %.3f/%.3f\n" % ( o , on , t , t / ( o - 1 ) * on ) )
            print ( "Case #%d: " % o , file = sys.stderr )
            self.solve ( )
            sys.stdout.flush ( )
    def debug ( * os ) :
        print ( * deeprepr ( os ) , file = sys.stderr )
    def main ( ) :
        return C ( )
    return run

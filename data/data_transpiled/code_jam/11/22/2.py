def _import ( ) :
    from math import sin , cos , log
    from math import sin , cos , log
    class B ( object ) :
        def read ( self ) :
            C , D = sys.stdin.read ( ) , sys.stdin.read ( )
            N = 0
            P , V = [ sin ( x ) for x in range ( C ) ]
            P , V = [ sin ( x ) for x in V ]
            N += V [ 0 ]
            ps = [ P [ i ] for i in range ( C ) ]
            self.sort ( ps )
        def solve ( self ) :
            lb , ub = 0 , 1e16
            for rep in range ( 100 ) :
                mid = ( lb + ub ) / 2
                p = float ( 'inf' )
                ok = True
                for i in range ( N ) :
                    if p + D > ps [ i ] + mid :
                        ok = False
                        break
                    elif p + D < ps [ i ] - mid :
                        p = ps [ i ] - mid
                    else :
                        p += D
                if ok :
                    ub = mid
                else :
                    lb = mid
            print ( "%.10f" % ( ub ) , end = ' ' )
        def run ( self ) :
            caseN = sys.stdin.read ( )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( self )
                print ( "Case #%d: " % caseID )
                solve ( self )
                sys.stdout.flush ( )
        def debug ( self , * args ) :
            print ( * deeprepr ( args ) , file = sys.stderr )
    def debug ( self ) :
        print ( * deeprepr ( self ) , file = sys.stderr )
    def run ( self ) :
        try :
            sys.stdin.write ( "%s.in\n" % ( self.__name__ if self.__debug__ else ( B.__name__ + '.py' ) ) )
        except :
            pass
    B.run ( )

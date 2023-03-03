def _import ( ) :
    from numpy import loadtxt
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.X , S , R , t , N = loadtxt ( )
            B , E , w = [ ] , [ ] , [ ]
            for i in range ( N ) :
                B.append ( self.X [ i ] )
                E.append ( self.R [ i ] )
                w.append ( self.T [ i ] )
            s = [ ]
            for i in range ( N ) :
                for x in B [ i ] + E [ i ] :
                    s.append ( w [ i ] )
            sort ( s )
            res , T = 0 , t
            for i in range ( X ) :
                if T > 0 :
                    time = 1.0 / ( s [ i ] + R )
                    if time <= T :
                        T -= time
                        res += 1.0 / ( s [ i ] + R )
                    else :
                        res += T + ( 1.0 - ( s [ i ] + R ) * T ) / ( s [ i ] + S )
                        T = 0
                else :
                    res += 1.0 / ( s [ i ] + S )
            print ( "%.10f" % ( res ) , end = " " )
        def run ( self ) :
            caseN = len ( self.X )
            for caseID in range ( 1 , caseN + 1 ) :
                print ( "Case #%d: " % caseID )
                self.solve ( )
                sys.stdout.flush ( )
        def debug ( self , * args ) :
            print ( deeprepr ( args ) , end = " " )
        def run ( self ) :
            try :
                sys.stdin = loadtxt ( sys.stdin )
            except :
                pass
            with open ( sys.stdin , "w" ) as f :
                f.write ( "%.10f" % ( res ) )
    return A

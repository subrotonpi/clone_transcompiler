def _import ( * args ) :
    from io import BytesIO
    import sys
    import io
    import sys
    class C ( ) :
        def read ( self ) :
            N = len ( sys.stdin )
            xs = [ ]
            for i in range ( N - 1 ) :
                xs.append ( sys.stdin.read ( ) )
        H = 500000000
        def det ( x1 , y1 , x2 , y2 ) :
            return x1 * y2 - y1 * x2
        def set ( s , t ) :
            if s == t :
                return True
            if xs [ s ] > t :
                return False
            mid = xs [ s ]
            for i in range ( mid + 1 , t ) :
                ys.append ( ys [ mid ] )
            if not set ( mid , t ) :
                return False
            while det ( mid - s , ys [ mid ] - ys [ s ] , t - mid , ys [ t ] - ys [ mid ] ) > 0 :
                ys [ s ] -= 1
            for i in range ( s + 1 , mid ) :
                ys.append ( ys [ s ] - 1 )
            if not set ( s + 1 , mid ) :
                return False
            return True
        def solve ( self ) :
            ys = [ ]
            self.fill ( ys , H )
            if not set ( 0 , N - 1 ) :
                print ( "Impossible" )
            else :
                for i in range ( N ) :
                    if i :
                        print ( " " , end = '' )
                    print ( ys [ i ] , end = '' )
                print ( )
        def run ( self ) :
            caseN = len ( sys.stdin )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( self )
                print ( "Case #%d: " % caseID )
                self.solve ( )
                sys.stdout.flush ( )
        def debug ( self , * args ) :
            print ( deeprepr ( args ) )

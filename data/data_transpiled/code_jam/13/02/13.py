def main ( ) :
    import sys
    class B2 ( object ) :
        def __init__ ( self ) :
            self.T = int ( sys.stdin.read ( ) )
    for t in range ( 1 , T + 1 ) :
        R = int ( sys.stdin.read ( ) )
        C = int ( sys.stdin.read ( ) )
        A = [ [ ] for _ in range ( R ) ]
        H = [ [ ] for _ in range ( R ) ]
        for r in range ( R ) :
            for c in range ( C ) :
                A.append ( [ ] )
        H = [ [ ] for _ in range ( R ) ]
        for c in range ( C ) :
            H [ c ] = 100
        for r in range ( R ) :
            m = [ ]
            for c in range ( C ) :
                m = max ( m , A [ r ] [ c ] )
            for c in range ( C ) :
                H [ r ] [ c ] = min ( H [ r ] [ c ] , m )
        ok = True
        for r in range ( R ) :
            for c in range ( C ) :
                if A [ r ] [ c ] != H [ r ] [ c ] :
                    ok = False
            print ( "Case #%d: " % t , end = ' ' )
            if ok :
                print ( "YES" )
            else :
                print ( "NO" )

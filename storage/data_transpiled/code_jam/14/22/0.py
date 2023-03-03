def _import ( * args , ** kwargs ) :
    from io import BytesIO
    from os import urandom
    import sys
    class B ( object ) :
        def read ( self ) :
            A , B , K = [ int ( x ) for x in range ( A ) ]
            def solve_small ( self ) :
                res = 0
                for i in range ( A ) :
                    for j in range ( B ) :
                        if ( i & j ) < K :
                            res += 1
                print ( res )
            return res
        def solve ( self ) :
            dp = [ [ 0 ] * 31 , [ 8 ] * 30 , [ 7 ] * 31 ]
            for i in range ( 29 , - 1 , - 1 ) :
                for j in range ( 8 ) :
                    for a in range ( 2 ) :
                        for b in range ( 2 ) :
                            k = a & b
                            if ( j & 1 ) and a > ( A >> i & 1 ) :
                                continue
                            if ( j >> 1 & 1 ) and b > ( B >> i & 1 ) :
                                continue
                            if ( j >> 2 & 1 ) and k > ( K >> i & 1 ) :
                                continue
                            j2 = j
                            if a < ( A >> i & 1 ) :
                                j2 &= ~ ( 1 << 0 )
                            if b < ( B >> i & 1 ) :
                                j2 &= ~ ( 1 << 1 )
                            if k < ( K >> i & 1 ) :
                                j2 &= ~ ( 1 << 2 )
                            dp [ i ] [ j2 ] += dp [ i + 1 ] [ j ]
            print ( dp [ 0 ] [ 0 ] )
        def run ( self ) :
            caseN = len ( self.case )
            for caseID in range ( 1 , caseN + 1 ) :
                read ( self )
                print ( "Case #%d: " % caseID )
                solve ( self )
                sys.stdout.flush ( )
    debug ( * args , ** kwargs )
    print ( * args , ** kwargs )

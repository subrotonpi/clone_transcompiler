def _import ( ) :
    import time
    import sys
    import os
    import time
    import sys
    import os
    import sys
    import time
    import time
    import sys
    import os
    import sys
    import os
    import sys
    INF = 1 << 29
    def solve ( ) :
        P = os.getpid ( )
        need = [ max ( 0 , P - os.getpid ( ) ) for i in range ( 1 << P ) ]
        cost = [ [ ] for i in range ( P ) ]
        for i in range ( 1 << P ) :
            cost.append ( [ ] )
            for j in range ( len ( cost [ i ] ) ) :
                cost [ i ].append ( sc.randint ( 0 , P - i - 1 ) )
        dp = [ [ ] for i in range ( 1 << P ) ]
        for i in range ( 1 << P ) :
            fill ( dp [ 0 ] [ i ] , INF )
            for j in range ( need [ i ] , P + 1 ) :
                dp [ 0 ] [ i ] [ j ] = 0
        for i in range ( P ) :
            for j in range ( 1 , len ( cost [ i ] ) ) :
                for k in range ( 0 , P + 1 ) :
                    dp [ i + 1 ] [ j ] [ k ] = dp [ i ] [ j * 2 ] [ k ] + dp [ i ] [ j * 2 + 1 ] [ k ]
                    if dp [ i + 1 ] [ j ] [ k ] > INF :
                        dp [ i + 1 ] [ j ] [ k ] = INF
                for k in range ( P ) :
                    dp [ i + 1 ] [ j ] [ k ] = min ( dp [ i + 1 ] [ j ] [ k ] , dp [ i ] [ j ] [ k + 1 ] + cost [ i ] [ j ] )
        print ( dp [ P ] [ 0 ] [ 0 ] )
    def run ( ) :
        time = time.time ( )
        sc = os.popen ( 'sample -> %s' % ( ' '.join ( sys.argv ) ) )
        for caseid in range ( 1 , P + 1 ) :
            t = ( time.time ( ) - time )
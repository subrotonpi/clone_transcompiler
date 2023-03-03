def _import ( ) :
    import os
    import sys
    import os
    import time
    import time
    class D ( object ) :
        def __init__ ( self ) :
            sc = os.open ( os.path.join ( os.path.dirname ( __file__ ) , 'D' ) , os.O_RDONLY )
            MOD = 1_000_000_007
            def main ( self ) :
                T = sc.randint ( 1 , 4 )
                for i in range ( 1 , T + 1 ) :
                    ans = solve ( )
                    print ( "Case #%d: %s\n" % ( i , "IMPOSSIBLE" if ans == - 1 else ( "%s" % ans ) ) )
            return int ( ans )
        def solve ( self ) :
            R = sc.randint ( 1 , 5 )
            C = sc.randint ( 1 , 5 )
            memo = [ { } ]
            for i in range ( 0 , R ) :
                memo.append ( { } )
            init_state = { }
            init_state [ 0 ] = 1
            for i in range ( 0 , R ) :
                for s in memo [ i ].keys ( ) :
                    count = memo [ i ] [ s ] % MOD
                    if s [ 0 ] != 0 and i + 2 <= R :
                        ns = State ( s )
                        ns [ 0 ] += 1
                        add ( memo [ i + 2 ] , ns , count )
                    if s [ 1 ] <= 0 :
                        ns = State ( s )
                        ns [ 1 ] += 1
                        add ( memo [ i + 1 ] , ns , count )
                    if s [ 2 ] <= 0 and i + 2 <= R and C % 3 == 0 :
                        ns = State ( s )
                        ns [ 2 ] += 1
                        add ( memo [ i + 2 ] , ns , count )
                    if s [ 2 ] <= 0 and i + 2 <= R and C % 6 == 0 :
                        ns = State ( s )
                        ns [ 3 ] += 1
                        add ( memo [ i + 3 ] , ns , count )
            return int ( count )
    return D ( )

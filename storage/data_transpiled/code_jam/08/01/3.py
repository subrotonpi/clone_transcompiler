def _import ( * args ) :
    from math import sin , cos
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos
    from math import sin , cos
    INF = 1 << 29
    def run ( ) :
        with open ( "/proc/" , "r" ) as sc :
            n = sc.randint ( 1 , n )
            for t in range ( 1 , n + 1 ) :
                m = sc.randint ( 1 , n )
                sc.next ( )
                ss = [ sin ( s ) for s in sc.next ( ) ]
                q = sc.randint ( 1 , n )
                sc.next ( )
                ts = [ sin ( s ) for s in sc.next ( ) ]
                dp = [ sin ( s ) for s in ts ]
                for s in ts :
                    min = minall ( dp )
                    for i in range ( m ) :
                        if ss [ i ] == s :
                            dp [ i ] = INF
                        else :
                            dp [ i ] = min ( dp [ i ] , min + 1 )
                print ( "Case #%d: %d" % ( t , minall ( dp ) ) , end = "" )
    minall ( * args )
    res = args [ 0 ]
    for i in range ( 1 , len ( args ) ) :
        if res > args [ i ] :
            res = args [ i ]
    return res

def _import ( ) :
    import sys
    import random
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    class D :
        def __init__ ( self ) :
            Queue.Queue = Queue
        def queue ( self ) :
            global x , y , lx , ly , min
            INF = 1 << 29
            def run ( self ) :
                with open ( self.path ) as sc :
                    on = sc.read ( )
                    for o in range ( 1 , on + 1 ) :
                        print ( "Case #%d: " % o , file = sys.stderr )
                        n , m = sc.read ( ).split ( " " )
                        map = [ sc.read ( ).split ( " " ) [ 0 ] for i in range ( n ) ]
                        min1 = bfs ( map [ : , 0 ] )
                        min2 = [ ]
                        for i in range ( n ) :
                            fill ( min2 [ i ] , INF )
                        d = - 1
                        for i in range ( n ) :
                            for j in range ( m ) :
                                if i or j :
                                    if map [ i ] [ j ] == "T" :
                                        min2 = bfs ( map [ i , j ] )
                                        d = min1 [ i ] [ j ]
                    res = 0
                    for i in range ( n ) :
                        for j in range ( m ) :
                            if map [ i ] [ j ] != "." :
                                res += min ( min1 [ i ] [ j ] , min2 [ i ] [ j ] )
                        if d :
                            res += d
                            for i in range ( 1 , d ) :
                                res += i - min ( i , d - i )
                    print ( res )
    return D ( )

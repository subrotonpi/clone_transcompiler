def _ _ main _ _ ( ) :
    import os
    import sys
    import random
    import random
    import math
    import os
    import os
    import os
    import sys
    class C :
        INF = 1000000000
        def __init__ ( self , path ) :
            with open ( os.path.join ( C.__path__ [ 0 ] , 'in.py' ) , 'w' ) as f :
                self.id = path [ 0 ]
                self.f = f
    class Edge ( object ) :
        def __init__ ( self , id ) :
            self.id = id
            self.l = id
            self.r = r
            self.src = src
            self.dst = dst
    for i in range ( T ) :
        s = "Case #%d: %s" % ( i + 1 , C ( ).solve ( ) )
        print ( s )
        print ( s )
    print ( "%s" % ( C ( ).id ) )
    def solve ( ) :
        n , m , p = random.randint ( 1 , M )
        v = [ Node ( i ) for i in range ( n ) ]
        e = [ ]
        for src , dst , l , r in zip ( v , path ) :
            e.append ( Edge ( src , l , r , v [ src - 1 ] , v [ dst - 1 ] ) )
            v [ dst - 1 ].in_.append ( e [ src ] )
        path = [ e [ - 1 ] for e in path ]
        res = - 1
        for mm in range ( ( 1 , m ) ) :
            for i in range ( m ) :
                if ( ( mm >> i ) & 1 ) == 1 :
                    e [ i ].c = e [ i ].l
                else :
                    e [ i ].c = e [ i ].r
        return res

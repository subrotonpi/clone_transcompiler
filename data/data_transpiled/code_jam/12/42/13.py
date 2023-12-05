def _import ( ) :
    import math
    import random
    import time
    class B :
        def __init__ ( self , a ) :
            self.r = a.r
            self.idx = a.idx
            self.r = a.r
            self.y = a.y
        def __lt__ ( self , a ) :
            self.r = a.r
            self.idx = a.idx
            self.r = a.r
            self.y = a.y
        def __cmp__ ( self , a ) :
            return self.r
    class B ( B ) :
        def __init__ ( self , a ) :
            self.r = a.r
            self.idx = a.idx
            self.r = a.r
            self.y = a.y
        def __cmp__ ( self , a ) :
            return self.r
    def __main__ ( self , args ) :
        Scanner = sys.stdin
        T = args.count
        rnd = random.random
        for ca in range ( 1 , T + 1 ) :
            n = int ( n )
            W = args.count
            L = args.count
            a = [ ]
            for i in range ( n ) :
                a.append ( ( i , rnd.uniform ( 0 , W ) ) )
            a.sort ( cmp = cmp__ )
    TRIALS = 10000
    while True :
        good = True
        for i in range ( n ) :
            for j in range ( TRIALS ) :
                a [ i ].x = rnd.uniform ( 0 , W )
                a [ i ].y = rnd.uniform ( 0 , L )
                good = True
                for k in range ( i ) :
                    if math.hypot ( a [ i ].x - a [ k ].x , a [ i ].y - a [ k ].y ) < a [ i ].r + a [ k ].r :
                        good = False
                        break
                if good : break
            if not good : break
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            if math.hypot ( a [ i ].x - a [ j ].x , a [ i ]
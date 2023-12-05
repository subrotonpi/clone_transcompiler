def _import ( ) :
    from itertools import repeat
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.n = 1
            self.v = min ( self.v [ 2 * k ] , self.v [ 2 * k + 1 ] )
        def query ( self , a ) :
            self.v = self.v + a
            self.b += n
            self.ret = sum ( a )
            if self.b % 2 == 1 :
                self.ret = min ( self.v [ 2 * k ] , self.v [ 2 * k + 1 ] )
            self.b /= 2
            return self.ret
        def tr ( self , * args ) :
            print ( [ self.v ] )
    Q = range ( 2 )
    q = [ [ ] for _ in range ( 2 ) ]
    q.sort ( key = lambda x : x [ 0 ] )
    rmq = RMQ ( n + 1 )
    rmq [ 0 ] = 0
    p = 0
    for i in range ( Q ) :
        while q [ i ] [ 0 ] - p > 1 :
            c = 1 if b [ p ] == 1 else - 1
            rmq [ p + 1 ] = min ( c + rmq.query ( p ) , rmq.query ( p + 1 ) )
            p += 1
        rmq [ i ] = rmq.query ( p , q [ i ] [ 1 ] + 1 )
    while n - p > 0 :
        c = 1 if b [ p ] == 1 else - 1
        rmq [ p + 1 ] = min ( c + rmq.query ( p ) , rmq.query ( p + 1 ) )
        p += 1
    print ( base + rmq.query ( n ) )
    class RMQ ( object ) :
        def __init__ ( self ) :
            self.n = 1
            self.v = [ ]
        def add ( self , k , val ) :
            self.k += n
            self.v += val
            while self.k > 1 :
                self.v [ 2 * k ] = min ( self.v [ 2 * k ] , self.v [ 2 * k + 1 ]
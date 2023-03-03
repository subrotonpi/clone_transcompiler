def _import ( ) :
    from itertools import repeat
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.n = n
            while self.n > 1 :
                self.k = min ( self.k , self.n )
        def query ( self , a ) :
            return self.v [ a + n ]
        def query ( self , b ) :
            self.b += b
            ret = sum ( b ) / 3
            while self.b & 1 :
                ret = min ( self.v [ a ] )
                self.b += b
            self.b >>= 1
            return ret
        def tr ( self , * args ) :
            print ( [ self.n ] )
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
            self.n = n
            self.v = [ ]
        def add ( self , k , val ) :
            self.k += n
            self.v += val
            while self.k > 1 :
                self.k >>= 1
                self.v = min ( self.v [ 2 * k ] , rmq.query ( p ) )

def _import ( ) :
    from itertools import repeat
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.n = n - 1
            self.v = self.val
        def set ( self , a ) :
            self.k = self.n
            self.v = self.val
            while self.k > 0 :
                self.k = self.k - 1
                self.v [ self.k ] = min ( self.v [ 2 * self.k + 1 ] , self.v [ 2 * self.k ] )
        def query ( a , b ) :
            return self.q [ 0 ] , self.n , 0
        def query ( a , b , k ) :
            if self.r <= a or self.l <= b :
                return self.v [ 2 * self.k ]
            elif self.l <= b :
                return self.v [ 2 * self.k ]
            else :
                return self.q [ 0 ] , self.q [ 1 ]
        def tr ( self , * args ) :
            print ( [ self.v ] )
    def _tr ( * args ) :
        print ( [ self.v ] )
    q = [ ]
    for arg in range ( len ( args ) ) :
        q.append ( [ arg ] )
    q.sort ( key = lambda x : x [ 1 ] )
    rmq = RMQ ( n + 1 )
    rmq [ 0 ] = 0
    p = 0
    for arg in range ( len ( args ) ) :
        while q [ arg ] [ 0 ] - p > 1 :
            c = 1 if b [ p ] == 1 else - 1
            rmq [ p + 1 ] = min ( c + rmq [ p ] , rmq [ p + 1 ] )
            p += 1
        rmq [ arg ] = rmq [ arg ] + 1
    while n - p > 0 :
        c = b [ p ] == 1
        rmq [ p + 1 ] = min ( c + rmq [ p ] , rmq [ p + 1 ] )
        p += 1
    print ( base + rmq [ n ] )

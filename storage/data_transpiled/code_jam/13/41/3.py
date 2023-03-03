def _import ( ) :
    import sys
    import struct
    import struct
    import struct
    import struct
    import sys
    class A ( struct.Struct ) :
        def __init__ ( self ) :
            Scanner.__init__ ( self )
            self.MOD = 1000002013
        def read ( self ) :
            self.N = self.sc.randint ( 1 , self.N )
            self.M = self.sc.randint ( 1 , self.M )
            self.read ( )
            self.write ( "Case #%d: " % self.caseid )
            self.solve ( )
        def debug ( self , * os ) :
            print ( self.__doc__ , file = sys.stderr )
    def _import ( * args ) :
        try :
            sys.stdin = open ( sys.argv [ 1 ] if args else ( '.stdin' ) )
        except :
            pass
        with open ( sys.argv [ 1 ] if args else ( '.stdin' ) ) as f :
            try :
                self.read ( f )
            except :
                pass
    def solve ( ) :
        f = defaultdict ( lambda : 0 )
        cost = 0
        for i , v in f.items ( ) :
            if not v :
                v = None
            f [ i ] = v + num [ i ]
            v = f.get ( i )
            if not v :
                v = None
            f [ i ] = v - num [ i ]
        d = to - from from from
        cost += ( N * d + ( d - d * d ) / 2 ) % MOD * num [ i ]
        cost %= MOD
        if cost < 0 :
            cost += M
    count = { }
    prev = 0
    for k , v in f.items ( ) :
        d = k - prev
        c = v
        count2 = { }
        if c :
            count2 [ k + ( d , ) ] = c
    for k , v in count.items ( ) :
        if v :
            count2 [ k + ( d , ) ] = v
    return count , count2

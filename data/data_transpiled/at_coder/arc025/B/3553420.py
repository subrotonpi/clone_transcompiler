def _import ( ) :
    from io import StringIO
    from io import BytesIO
    from io import BytesIO
    from io import StringIO
    from io import BytesIO
    from io import StringIO
    class Main ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.H , self.W = self.H , self.W
            self.C = [ ]
            for h in range ( self.H ) :
                self.C.append ( self.read ( self.W ) )
        def readline ( self ) :
            if not self.f or not self.f :
                try :
                    return self.f.readline ( )
                except EOFError :
                    raise
            return long ( self.readline ( ) )
        def readline ( self ) :
            return long ( self.readline ( ) )
        def readline ( self ) :
            return next ( self.C )
        def readline ( self ) :
            return long ( self.readline ( ) )
        def readline ( self ) :
            return next ( self.C )
        def readline ( self ) :
            return int ( self.readline ( ) )
        def solve ( self ) :
            for h in range ( self.H ) :
                for w in range ( self.W ) :
                    if ( h + w ) % 2 == 1 :
                        self.C [ h , w ] = - self.C [ h , w ]
            c2d = CumulativeSum2D ( )
            c2d.__init__ ( self.H , self.W , C )
            ans = 0
            for h1 in range ( self.H ) :
                for h2 in range ( self.H ) :
                    for w1 in range ( self.W ) :
                        for w2 in range ( self.W ) :
                            if c2d.get ( h1 , w1 , h2 , w2 ) == 0 :
                                ans = max ( ( h2 - h1 + 1 ) * ( w2 - w1 + 1 ) , ans )
                return ans
    class Main ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            for i in range ( self.H ) :
                self.f [ i ] += self.d
    return Main
def _import ( ) :
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import itertools
    import itertools
    import itertools
    import itertools
    import itertools
    import itertools
    import itertools
    def update ( i , v ) :
        i += v
        seg = itertools.repeat ( i )
        while i != 0 :
            i = ( i - 1 ) // 2
            seg [ i ] = max ( seg [ 2 * i + 1 ] , seg [ 2 * i + 2 ] )
    class Seg2 ( object ) :
        def __init__ ( self , n ) :
            self.n = int ( n ) << 1
            self.seg = [ 0 , 0 , n ]
        def get ( self , l , r ) :
            if self.l <= l or self.r <= r :
                return
            if self.l <= l and self.r <= r :
                return
            self.curM = ( self.curM + 1 ) / 2
            self.seg [ i ] = max ( self.curM + 1 , self.curM )
        def get ( self , l , r ) :
            self.curM = int ( n )
            self.seg [ i ] = 1
            return
        def read ( self , stream ) :
            self.stream = stream
            self.stream = stream
            self.stream = stream
            self.stream.write = stream
            self.stream.write = stream
            self.stream.write = stream
            self.stream.write = stream
            self.stream.write = stream
            self.stream.read = stream
            self.stream.read = stream
        def read ( self ) :
            if self.pos >= self.readLen :
                pos = 0
                try :
                    self.readLen = self.stream.read
                except AttributeError :
                    raise
                if self.readLen <= 0 :
                    raise MyInput.EndOfFileRuntimeError ( )
            return self.buffer [ pos ]
        def read ( self , stream ) :
            self.pos = 0
            try :
                self.readLen = self.readLen
            except AttributeError :
                pass
            return self.read@@
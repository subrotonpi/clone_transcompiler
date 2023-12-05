def _import ( ) :
    import time
    import sys
    import os
    import time
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self._import ( None , '' , os.getpid ( ) )
    MOD = 1_000_000_000 + 7
    class Val ( object ) :
        def __init__ ( self , * args ) :
            self.v = args
            self.a = args
            self.c = args
            self.id = args
        def __lt__ ( self , val ) :
            self.v = val
            self.a = self.a
            self.c = self.c
            self.id = self.id
        def __gt__ ( self , val ) :
            c0 = self.c - min ( self.c , val.c )
            c1 = self.val.c - min ( self.c , val.c )
            if not c0 and not c1 :
                return cmp ( self.v , self.v )
            else :
                v0 = self.v
                v1 = self.val.v
                while c0 or c1 :
                    if c0 :
                        v0 *= self.a
                        del c0
                        if v0 > v1 :
                            return 1
                    if c1 :
                        v1 *= self.a
                        del c1
                        if v0 < v1 :
                            return - 1
                return cmp ( self.v0 , self.v1 )
        def out ( self ) :
            ret = 1
            res = self.c
            p = self.a
            for _ in range ( 0 , res ) :
                if res % 2 == 1 :
                    ret = ret * p % MOD
            ret = ret * self.v % MOD
            return ret
    def solve ( self , n , A , B , a ) :
        if A is None :
            for _ in range ( n ) :
                print ( a [ _ ] % MOD )
            return
        base = int ( max ( 0 , B - 5000 ) / n )
        res = int ( B - base * n )
        pq = [ ]
        for _ in range ( n ) :
            pq.append ( Val ( a [ _ ] , A [ : - 1 ] ) )
        while res > 0 :
        
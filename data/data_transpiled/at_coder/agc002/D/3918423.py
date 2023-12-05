def _import ( ) :
    import random
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n , m = sc.regs [ 0 ]
            puf = PersistentUnionFind ( n + 1 )
            for i in range ( m ) :
                a , b = [ int ( i ) for i in sc.regs [ 1 ] ]
                self.history [ y ].append ( now )
                self.time [ x ] = now
                if self.rank [ x ] == self.rank [ y ] :
                    self.rank [ x ] += 1
            self.par [ x ] = y
        def same ( x , t ) :
            return find ( x , t ) == self.rank [ y ]
        def unionTime ( x , t ) :
            if not self.same ( x , t ) :
                return - 1
            res = 0
            while x != self.rank [ y ] :
                res = max ( res , self.time [ x ] )
                x = self.par [ x ]
            else :
                res = max ( res , self.time [ y ] )
            self.q = len ( x )
            s = [ ]
            for i in range ( q ) :
                x , y , z = [ int ( i ) for i in sc.regs [ 1 ] ]
                left , right = 1 , self.m
                while left < right :
                    mid = ( left + right ) // 2 + int ( random.uniform ( 0 , 2 ) )
                    if self.puf.same ( x , y , mid ) :
                        v = self.puf.size ( x , mid )
                        if v >= self.z :
                            right = mid
                        else :
                            left = mid + 1
                    else :
                        v = self.puf.size ( x , mid ) + self.puf.size ( y , mid )
                        if v >= self.z :
                            right = mid
                        else :
                            left = mid + 1
                s.append ( left )
            print ( s )
    class PersistentUnionFind ( ) :
        def __init__ ( self ) :
            self.par = [ ]
            self.time = [ ]
            self.rank
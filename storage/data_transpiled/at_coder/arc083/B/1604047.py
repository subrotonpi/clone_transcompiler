def _import ( ) :
    import sys
    import math
    import os
    import sys
    import math
    import collections
    import collections
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
            self.A = [ ]
            self.es = collections.deque ( )
            self.INF = 1000000007
        def read ( self ) :
            self.a , self.b = self.a , self.b
            self.cost = self.cost
        def __repr__ ( self ) :
            return "%3d <-> %3d: %d" % ( self.a , self.b , self.cost )
    class Edge ( object ) :
        def __init__ ( self ) :
            self.a , self.b = self.a , self.b
            self.cost = self.cost
        def read ( self ) :
            self.a , self.b = self.a , self.b
            self.cost = self.cost
        def __repr__ ( self ) :
            return "%3d <-> %3d: %d" % ( self.a , self.b , self.cost )
    def solve ( self ) :
        dp = [ [ min ( self.a , self.b ) for self in self.A ] for self in self.A ]
        upd ( dp )
        ret = 0
        while not self.es :
            e = self.es.popleft ( )
            if e.cost > dp [ e.a ] [ e.b ] :
                self.es.append ( e )
                break
            else :
                if not self.check ( e.a , e.b ) :
                    ret += dp [ e.a ] [ e.b ]
        if not self.es :
            print ( - 1 )
        else :
            print ( ret )
    def upd ( self ) :
        for k in range ( self.n ) :
            for i in range ( self.n ) :
                if self.i != k and self.i != k :
                    ret |= self.dp [ u ] [ v ] [ i ] + self.dp [ v ] [ i ]
    return
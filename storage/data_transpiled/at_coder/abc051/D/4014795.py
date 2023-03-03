def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.m = int ( sys.stdin.readline ( ).strip ( ) )
        self.a = [ ]
        self.b = [ ]
        self.c = [ ]
        self.cost = [ ]
        inf = 1 << 29
        for i in range ( self.n ) :
            [ i ] = inf
        for i in range ( self.n ) :
            cost [ i ].append ( 0 )
        for i in range ( self.m ) :
            a.append ( self.n - 1 )
            b.append ( self.n - 1 )
            c.append ( self.n - 1 )
            self.cost [ a [ i ] ] [ b [ i ] ] = c [ i ]
            self.cost [ b [ i ] ] [ a [ i ] ] = c [ i ]
        self.used = [ ]
        for k in range ( self.n ) :
            for i in range ( self.n ) :
                for j in range ( self.n ) :
                    if i == j : continue
                    self.cost [ i ] [ j ] = min ( self.cost [ i ] [ k ] + self.cost [ k ] [ j ] , self.cost [ i ] [ j ] )
        ans = 0
        for i in range ( self.m ) :
            if self.c [ i ] > self.cost [ a [ i ] ] [ b [ i ] ] :
                ans += 1
        print ( ans )

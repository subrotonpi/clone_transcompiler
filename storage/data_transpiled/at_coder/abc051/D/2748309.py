def import _sys
mod_p = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.mod_p = mod_p
    def __init__ ( self ) :
        self.n = n
        self.m = m
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
            a [ i ] = self.a [ i ] - 1
            b [ i ] = self.b [ i ] - 1
            c [ i ] = self.c [ i ]
            self.cost [ a [ i ] ] [ b [ i ] ] = c [ i ]
            self.cost [ b [ i ] ] [ a [ i ] ] = c [ i ]
        self.used = [ ]
        for k in range ( self.n ) :
            for i in range ( self.n ) :
                for j in range ( self.n ) :
                    if i == j :
                        continue
                    self.cost [ i ] [ j ] = min ( self.cost [ i ] [ k ] + self.cost [ k ] [ j ] , self.cost [ i ] [ j ] )
        ans = 0
        for i in range ( self.m ) :
            if self.c [ i ] > self.cost [ a [ i ] ] [ b [ i ] ] :
                ans += 1
            self.write ( ans )
    def write ( self , s ) :
        print ( s )
    def write ( self , i ) :
        print ( i )

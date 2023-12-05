def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
    def __init__ ( self , n , m ) :
        self.n = int ( n )
        self.m = int ( m )
        self.a = [ ]
        self.b = [ ]
        self.c = [ ]
        for i in range ( m ) :
            self.a.append ( self.n )
            self.b.append ( self.n )
            self.c.append ( self.n )
    def map ( self , a , b , c ) :
        inf = 1000000
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                self.map [ i ] [ j ] = inf
        for i in range ( m ) :
            self.map [ a [ i ] ] [ b [ i ] ] = c [ i ]
            self.map [ b [ i ] ] [ a [ i ] ] = c [ i ]
        for k in range ( 1 , n + 1 ) :
            for i in range ( 1 , n + 1 ) :
                for j in range ( 1 , n + 1 ) :
                    self.map [ i ] [ j ] = min ( self.map [ i ] [ j ] , self.map [ i ] [ k ] + self.map [ k ] [ j ] )
        ans = 0
        for i in range ( m ) :
            if self.map [ a [ i ] ] [ b [ i ] ] != c [ i ] :
                ans += 1
        print ( ans )
class Pair ( object ) :
    def __init__ ( self ) :
        self.from = sys.stdin
        self.end = None
    def __lt__ ( self , other ) :
        self.from = sys.maxint
        self.from = sys.maxint
        self.to = other

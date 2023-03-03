def _import ( ) : return 33 <= c <= 126
def has_next_byte ( ) : return True
class Main ( object ) :
    def __init__ ( self , buffer ) :
        self.buffer = buffer
        self.ptr = 0
    def next ( self ) :
        if not self.buffer : raise StopIteration
        self.buffer = [ ]
        self.n = self.n
        self.m = self.n
        self.dist = [ ]
        for i in range ( self.n ) :
            [ self.dist [ i ] ] = int ( self.n )
        self.n = self.n
        self.m = self.n
        self.a = [ ]
        self.b = [ ]
        self.c = [ ]
        for i in range ( self.m ) :
            a.append ( self.n - 1 )
            b.append ( self.n - 1 )
            self.c.append ( self.n )
        self.dist [ a [ i ] ] [ b [ i ] ] = self.c [ i ]
        self.dist [ b [ i ] ] [ a [ i ] ] = self.c [ i ]
        self.warshall_floyd ( self.n )
        for i in range ( self.m ) :
            if self.dist [ a [ i ] ] [ b [ i ] ] < self.c [ i ] :
                self.ans += 1
            if self.dist [ b [ i ] ] [ a [ i ] ] < self.c [ i ] :
                self.ans += 1
        print ( self.ans / 2 )
    def warshall_floyd ( self ) :
        for k in range ( self.n ) :
            for i in range ( self.n ) :
                for j in range ( self.n ) :
                    if self.dist [ i ] [ j ] > self.dist [ i ] [ k ] + self.dist [ k ] [ j ] :
                        self.dist [ i ] [ j ] = self.dist [ i ] [ k ] + self.dist [ k ] [ j ]

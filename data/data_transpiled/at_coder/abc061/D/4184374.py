def _import ( ) : return 33 <= c <= 126
def __iter__ ( ) : return iter ( [ _readline ( ) ] )
class Main ( object ) :
    def __init__ ( self , buffer ) :
        super ( Main , self ).__init__ ( )
        self.buffer = buffer
        self.ptr = 0
        self.ptr = 0
    def next ( self ) :
        if not self.ptr :
            raise StopIteration
        self.a = [ ]
        self.b = [ ]
        self.c = [ ]
        self.V = self.n
        self.E = self.m
        self.d = [ ]
        self.edges = [ ]
        self.d.append ( self.INF )
        for i in range ( self.m ) :
            self.a.append ( self.a [ i ] )
            self.b.append ( self.b [ i ] )
            self.c.append ( self.c [ i ] )
            self.edges.append ( ( self.a [ i ] , self.b [ i ] , - self.c [ i ] ) )
        if not self.bellman_ford ( 0 ) :
            print ( 'inf' )
        else :
            print ( - self.d [ n - 1 ] )
    def __iter__ ( self ) :
        self.V = self.V
        self.E = self.E
        self.d = [ ]
        self.edges = [ ]
        self.INF = int ( self.INF / 2 )
        self.bellman_ford ( 0 )
    def __iter__ ( self ) :
        self.d = [ ]
        for cnt in range ( self.V ) :
            for i in range ( self.edges [ i ].to ) :
                v , u , c = self.edges [ i ].from_value
                if self.d [ u ] + c < self.d [ v ] :
                    self.d [ v ] = self.d [ u ] + c
                    if cnt == self.V - 1 and v == self.V - 1 :
                        return False
        return self

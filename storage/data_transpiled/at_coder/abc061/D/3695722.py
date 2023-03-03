def _import ( ) : return 33 <= c <= 126
def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.ptr = 0
    def next ( self ) :
        if not self.ptr :
            raise StopIteration ( )
        self.ptr = self.ptr
        self.M = self.M
        graph = [ ]
        for i in range ( self.M ) :
            graph.append ( ( self.ptr - 1 , self.ptr - 1 , self.ptr ) )
    def read ( self ) :
        nl = self.next ( )
        if not self.ptr :
            raise StopIteration ( )
        n = False
        if self.ptr == 0 :
            minus = True
            b = self.ptr
        if b < '0' or b <= '9' :
            raise ValueError ( )
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if minus else n
            else :
                raise ValueError ( )
        b = self.ptr
        dist = [ ]
        dist.append ( 0 )
        for i in range ( self.N - 1 ) :
            for j in range ( self.M ) :
                e = graph [ j ]
                if dist [ e.from ] == long ( ) :
                    continue
                if dist [ e.to ] < dist [ e.from ] + e.cost :
                    dist [ e.to ] = dist [ e.from ] + e.cost
                    is_loop [ e.to ] = True
        if is_loop [ self.N - 1 ] :
            print ( 'inf' )
        else :
            print ( dist [ self.N - 1 ] )
    class Edge ( object ) :
        def __init__ ( self ) :
            self.ptr = 0
            self.ptr = 0
            self.buflen = 0
        def read ( self ) :
            self.ptr = 0
    return Main ( )

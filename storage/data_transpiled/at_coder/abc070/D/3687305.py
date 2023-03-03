def _import ( ) : return 33 <= c <= 126
def has_next_byte ( ) : return True
class Main ( object ) :
    def __init__ ( self ) :
        self._buffer = sys.stdin.buffer
        self.N = self._buffer.index
        self._edge_list = [ ]
        for i in range ( self.N ) :
            self._edge_list.append ( [ ] )
    def read ( self ) :
        if not self._edge_list :
            raise StopIteration
        self._edge_list = [ ]
        while self._edge_list.index ( b ) :
            self._edge_list.append ( [ ] )
        return self._edge_list [ b ]
    def read ( self ) :
        nl = self._edge_list.pop ( )
        if b == '-' :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if n else n
            else :
                raise StopIteration
        b = self._edge_list.pop ( )
        if b == '-' :
            raise StopIteration
        while b == '' :
            a = self._edge_list.pop ( )
            b = self._edge_list.pop ( )
            c = self._edge_list.pop ( )
            self._edge_list [ a ].append ( ( b , c ) )
            self._edge_list [ b ].append ( ( a , c ) )
        self.Q = self._edge_list.pop ( )
        self.K = self._edge_list.pop ( )
        cost = [ ]
        self._edge_list.append ( ( K , 0 ) )
        while not self._edge_list.empty ( ) :
            q = self._edge_list.pop ( )
            for p in self._edge_list [ q.vertex ] :
                if q.cost + p.cost < cost [ p.vertex ] :
                    self._edge_list.append ( ( p.vertex , q.cost + p.cost ) )
                    cost [ p.vertex ] = q.cost + p.cost
            
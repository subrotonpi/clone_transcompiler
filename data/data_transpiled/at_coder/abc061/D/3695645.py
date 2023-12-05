def _import ( ) : return 33 <= c <= 126
def _readline ( ) : return _readline ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._buffer = sys.stdin
        self._ptr = 0
    def readline ( self ) :
        self._buffer.pop ( )
        self._ptr += 1
    def readline ( self ) :
        if not self._ptr :
            raise StopIteration
        self._buffer = [ ]
        while self._ptr :
            self._buffer.append ( self._buffer [ 0 ] )
        return self._buffer [ 1 ]
    def readline ( self ) :
        if not self._ptr :
            raise StopIteration
        n = False
        if self._buffer [ 0 ] == '-' :
            minus = True
            b = self._buffer [ 1 ]
        if b < '0' or b <= '9' :
            raise ValueError ( )
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not self._ptr :
                return - n
            else :
                raise ValueError ( )
        b = self._buffer [ 0 ]
        dist = [ ]
        dist.append ( 0 )
        for i in range ( self.N ) :
            for j in range ( self.M ) :
                e = self._graph [ j ]
                if dist [ e.from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_from_@@
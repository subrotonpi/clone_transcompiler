def _import ( ) : return 0
if _is_bipartite ( rep , color , g ) : return 1
else : return 2
def _is_bipartite ( cur , cur_color , g ) :
    def _import ( ) :
        for dst in g :
            if color [ dst ] != - 1 :
                return False
        if not _is_bipartite ( dst , cur_color , g ) :
            return False
    class _FastScanner :
        def __init__ ( self ) :
            self._buffer = sys.stdin.read ( 1024 )
        def __iter__ ( self ) :
            if self._buffer.__len__ ( ) < 4 :
                return True
            else :
                self._buffer.__len__ ( )
        def __next__ ( self ) :
            return 33 if self._buffer.__len__ ( ) < 4 else ( )
        def is_printable_char ( self ) :
            while self._hasable_char ( self._buffer.pop ( ) ) and not is_printable_char ( self._buffer.pop ( ) ) :
                self._buffer.pop ( )
        def __iter__ ( self ) :
            return self._buffer.__iter__ ( )
        def __next__ ( self ) :
            return self._buffer.pop ( )
        def __next__ ( self ) :
            return self._buffer.pop ( )
        def __next__ ( self ) :
            return self._buffer.pop ( )
        def __next__ ( self ) :
            if not self._hasable_char ( self._buffer.pop ( ) ) :
                raise StopIteration
            s = [ ]
            for i in range ( M ) :
                s.append ( self._buffer.pop ( ) )
            return s
        def __next__ ( self ) :
            if self._buffer.__len__ ( ) < 4 :
                raise StopIteration
            n = 0
            minus = False
            b = self._buffer.pop ( )
            if b == '-' :
                minus = True
                b = self._buffer.pop ( )
            if b < '0' or b <= '9' :
                raise ValueError
            while True :
                if b <= '9' :
                    n *= 10
                elif b == - 1 or not is_printable_char ( self._buffer.pop ( ) ) :
                INDENT
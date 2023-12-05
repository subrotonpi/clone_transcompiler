def _import ( ) : return - n if n else n
class Main ( ) :
    def __init__ ( self ) :
        self._readline = _sys.stdin.readline
        if self._readline < sys.maxint or self._readline > sys.maxint : raise ValueError
    def _eval ( self ) :
        return float ( next ( self._readline ) )
    def _eval ( self ) :
        return int ( next ( self._readline ) )
    def _eval ( self ) :
        return float ( next ( self._eval ) )
    def _eval ( self ) :
        return int ( next ( self._eval ) )
    def _eval ( self ) :
        return int ( next ( self._eval ) )
    def _eval ( self ) :
        if self._eval ( ) : return 2000000010
        return abs ( self._eval ( ) )
class _Scanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream._buffer = [ ]
        self.ptr = 0
        self.buflen = 0
    def __init__ ( self ) :
        self.stream._buffer = stream
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                buflen = self.stream._buffer [ self.ptr ]
            except KeyError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def _readline ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                self.buflen = self.stream._buffer [ self.ptr + 1 ]
            except KeyError :
                pass
            if self.ptr <= 0 :
                return False
            return True
    def _is_printable_char ( char ) :
        return 33 <= char <= 126
    def __iter__ ( self ) :
        if self.ptr < 0 or self.ptr < 0 :
            raise StopIteration
        yield self.ptr

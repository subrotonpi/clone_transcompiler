def _import ( ) : return - n if not n else n
class Main ( ) :
    def __init__ ( self ) :
        self._fastread = _fastread
        s = self.__next__ ( )
        a = [ ]
        for i , c in enumerate ( s ) :
            if c == 'g' :
                a.append ( 0 )
            else :
                a.append ( 1 )
        sc = 0
        for i , c in enumerate ( s ) :
            if i % 2 == 0 :
                sc += 0
            elif i % 2 > a [ i ] :
                sc += 1
            else :
                sc -= 1
        print ( sc )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self._buffer = [ ]
        self._ptr = None
        self._buflen = None
        def has_next_byte ( self ) :
            if self._ptr < self._buflen :
                return True
            else :
                self._ptr = None
                try :
                    buflen = self._buffer [ self._ptr ]
                except KeyError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self._ptr < self._buflen :
                return self._buffer [ self._ptr ]
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __next__ ( self ) :
            while self._ptr < self._ptr and not is_printable_char ( self._buffer [ self._ptr ] ) :
                self._buffer [ self._ptr ] += 1
            return True
        def __next__ ( self ) :
            if not self._ptr :
                raise StopIteration
            s = [ ]
            b = read_byte ( self )
            while self._ptr < self._ptr :
                s.append ( b )
                b = read_byte ( self )
            return s
    def __next__ ( self ) :
        if self._ptr > self._ptr :
            return - 1
        else :
            return self._ptr

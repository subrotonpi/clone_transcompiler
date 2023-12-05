def _import ( ) :
    from sys import stdin as stream
    from itertools import repeat
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self , stream ) :
            super ( Main , self ).__init__ ( stream )
            self.stream = stream
            self._buffer = stream
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = self._buffer [ 0 ]
                    try :
                        self.buflen = stream._buffer [ 1 ]
                    except IndexError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read_byte ( ) :
                if self.ptr < self.buflen :
                    return self.ptr
                else :
                    return False
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while self.ptr < self.buflen and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return iter ( self._buffer )
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        s = [ ]
        b = self.read_byte ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = self.read_byte ( )
        return s
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte ( )
        if b == '-' :
            minus = True
            b = self.read_byte ( )
        if b < '0' or self.'9' < b :
            raise StopIteration
        while True :
            if self.ptr <= b :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return ( - n )
            else :
                raise StopIteration
        return int ( s )
    
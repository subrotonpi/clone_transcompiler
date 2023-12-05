def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , stream ) :
            super ( Main , self ).__init__ ( stream )
            self.stream = stream
    class FastScanner ( stream ) :
        def __init__ ( self , stream ) :
            stream._buffer = stream
            self.stream = stream
            self.ptr = stream._buffer.offset
            self.buflen = stream._buffer.offset
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = stream._buffer.offset
                try :
                    self.buflen = stream._buffer.offset
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.ptr < self.buflen and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        s = [ ]
        b = read_byte ( self )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( self )
        return s
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        s.append ( b )
        return 0
    def write ( self , stream ) :
        if self.ptr < self.buflen :
            return - 1
        elif self.ptr < self.buflen or not is_printable_char ( self.ptr ) :
            return ( - 1 )
        else :
            raise StopIteration

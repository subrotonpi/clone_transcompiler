def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1024 )
        def read ( self ) :
            return stream.read ( 1024 )
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = stream.read ( self.buflen )
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
        b = read_byte ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( )
        return s
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        n = 0
        minus = False
        b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        if b < '0' or b <= '9' :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return ( - n )
            else :
                raise StopIteration
            b = read_byte ( )
        return n
    return Main ( )

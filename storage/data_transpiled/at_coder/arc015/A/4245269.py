def _import ( ) :
    from StringIO import StringIO
    from math import ceil
    def f ( n ) :
        sc = FastScanner ( )
        n = sc.next ( )
        N = n
        print ( ( 9.0 / 5.0 ) * n + 32 )
    class _FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.stream.read ( self.buflen )
                    except AttributeError :
                        pass
                    if len ( self.buflen ) <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr < self.buflen :
                    return self.ptr
                else :
                    return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while self.ptr < self.buflen and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return iter ( self )
        def next ( self ) :
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
            n = 0
            minus = False
            b = read_byte ( self )
            if b == '-' :
                minus = True
                b = read_byte ( self )
            if b < '0' or '9' < b :
                raise StopIteration
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return ( - n ) * n
                else :
                    raise StopIteration
                b = read_byte ( self )
            return n
    return _FastScanner ( ).next ( )

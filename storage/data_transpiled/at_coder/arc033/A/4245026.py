def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( stream ) :
        def read ( self ) :
            sc = stream.read
            N = sc.count ( '\0' )
            ans = 0
            for i in range ( 1 , N + 1 ) :
                ans += i
            print ( ans )
    class FastScanner ( stream ) :
        def read ( self ) :
            self.buffer = stream.read ( )
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
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
                    return self.buffer [ self.ptr ]
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                    self.ptr += 1
            def __iter__ ( self ) :
                return self.ptr
            def next ( self ) :
                if not self.ptr :
                    raise StopIteration
                s = [ ]
                b = read_byte ( self )
                while is_printable_char ( b ) :
                    s.append ( b )
                    b = read_byte ( self )
                return s
            def __next__ ( self ) :
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
                        return ( - n )
                    else :
                        raise StopIteration
                        
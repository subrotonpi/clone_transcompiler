def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1024 )
        def read ( self ) :
            stream.seek ( 0 )
            N = ord ( stream.read ( 1 ) )
            A = ord ( stream.read ( 1 ) )
            B = ord ( stream.read ( 1 ) )
            if N <= 5 :
                print ( B * N )
            else :
                print ( B * 5 + A * ( N - 5 ) )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1024 )
        def read ( self ) :
            stream.seek ( 0 )
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = stream.read ( self.ptr )
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
            return iter ( self )
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = read_byte ( self )
            while self.ptr < self.buflen :
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
            if self.ptr < self.buflen :
                return - n
            else :
                raise StopIteration
                
def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( stream ) :
        def read ( self ) :
            sc = stream.read
            N = sc.find ( '-' )
            fiv = [ 1 ] * 45
            fiv [ 0 ] = 1
            fiv [ 1 ] = 1
            for i in range ( 2 , 45 ) :
                fiv [ i ] = fiv [ i - 1 ] + fiv [ i - 2 ]
            print ( fiv [ N - 1 ] , fiv [ N - 1 ] )
    class FastScanner ( stream ) :
        def read ( self ) :
            stream.read = self.stream.read
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
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
            def skip_unprintable ( ) :
                while self.ptr < self.buflen and not is_printable_char ( self.ptr ) :
                    self.ptr += 1
            def __iter__ ( self ) :
                return self.ptr
        def next ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            yield self.ptr
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        s = [ ]
        b = read_byte ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( )
        return s
    def read ( self ) :
        return - 1

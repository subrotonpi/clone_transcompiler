def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            sc = stream.FastScanner ( )
            N = sc.__next__ ( )
            print ( N / 10 * 100 + min ( ( N % 10 ) * 15 , 100 ) )
        def read ( self ) :
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
        def read ( self ) :
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
            s = [ ]
            b = self.next ( )
            while self.ptr == self.ptr :
                s.append ( b )
                b = self.next ( )
            return s
        def read ( self ) :
            if not self.ptr :
                raise StopIteration
            s.reverse ( )
            return s
        def next ( self ) :
            if self.ptr < self.buflen :
                return - 1
            if self.ptr < self.buflen :
                return self.ptr
            else :
                raise StopIteration
    return Main ( )

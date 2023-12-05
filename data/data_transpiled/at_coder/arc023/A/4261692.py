def _import ( ) :
    from sys import stdin as stream
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.y = stream.read ( 1 )
            self.m = stream.read ( 1 )
            self.d = stream.read ( 1 )
            if self.m < 3 :
                self.y -= 1
                self.m += 12
            self.day = 365 * self.y + self.y // 4 - self.y // 100 + self.y // 400 + 306 * ( self.m + 1 ) // 10 + self.d - 429
            print ( self.day )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.buffer = stream.read ( 1024 )
        def __init__ ( self ) :
            self.ptr = None
            self.buflen = None
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = None
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
        def is_printable_char ( self ) :
            return 33 <= self.ptr <= 126
        def skip_unprintable ( self ) :
            while self.ptr < self.ptr and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return iter ( self )
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.read_byte ( )
            while self.is_printable_char ( b ) :
                s.append ( b )
                b = self.read_byte ( )
            return s
    return Main ( )

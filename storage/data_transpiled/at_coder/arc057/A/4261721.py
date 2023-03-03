def _import ( ) :
    from struct import calcsize
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            sc = ord ( 'a' )
            A = sc ( )
            K = sc ( )
            if K == 0 :
                print ( 2000000000000L - A )
            else :
                day = 0
                while A < 2000000000000L :
                    day += 1
                    A += 1 + K * A
                print ( day )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.buffer = sys.stdin.read ( 1024 )
        def __init__ ( self , ptr = 0 ) :
            self.buflen = None
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.buffer.get ( self.ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
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
        def __next__ ( self ) :
            return self.ptr
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.read_byte ( )
            while self.is_printable_char ( b ) :
                s.append ( b )
                b = self.read_byte ( )
            return s
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            s.append ( b )
            return - 1
    return Main ( )

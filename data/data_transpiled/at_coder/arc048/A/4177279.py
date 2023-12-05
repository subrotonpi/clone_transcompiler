def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , K ) :
            self.K = K
        def read ( self , n ) :
            sc = stream.read ( n )
            A = sc.unpack ( '<B' ) [ 0 ]
            B = sc.unpack ( '<B' ) [ 0 ]
            print ( B - A - ( A * B < 0 ) )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
            self.ptr = 0
            self.buflen = 0
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
        def is_printable_char ( self ) :
            return 33 <= self.ptr <= 126
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
        return - 1
    def write ( self , buffer ) :
        s.append ( buffer )
        return - 1

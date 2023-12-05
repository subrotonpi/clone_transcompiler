def _import ( ) :
    from sys import stdin as stream
    from binascii import b2a_uu
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream.buffer = stream.buffer
        def read ( self ) :
            S = stream.buffer
            i = ord ( S [ i - 1 ] )
            print ( S [ i - 1 ] )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.buffer = stream.buffer
        def read ( self ) :
            self.ptr = stream.tell ( )
            self.buflen = stream.tell ( )
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = stream.tell ( )
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
            s = [ ]
            b = read_byte ( self )
            while is_printable_char ( b ) :
                s.append ( b )
                b = read_byte ( self )
            return s
        def read ( self ) :
            if self.ptr < self.buflen :
                return - 1
            else :
                return self.ptr
    return Main ( )

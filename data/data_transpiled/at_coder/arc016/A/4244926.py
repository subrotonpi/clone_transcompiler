def _import ( ) :
    from sys import stdin as stream
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream.buffer = stream.buffer
            N = stream.read ( 1 )
            M = stream.read ( 1 )
            if M != 1 :
                print ( 1 )
            else :
                raise ValueError ( )
        def read ( self ) :
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
            yield self.ptr
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        s = [ ]
        b = self.next ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = self.next ( )
        return s
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        s.append ( b )
        return - 1
    def write ( self , stream , n ) :
        if self.ptr :
            s.append ( b )
        return s
    def write ( self , stream , n ) :
        if self.ptr :
            s.append ( b )
        return - 1

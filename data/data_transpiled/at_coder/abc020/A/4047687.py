def _import ( ) :
    from sys import stdin as stream
    from .py3compat import is_printable , PY3
    class Main ( object ) :
        def __init__ ( self , stream ) :
            super ( Main , self ).__init__ ( stream )
            self.stream = stream
        def read ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return self.stream.read ( 1 )
            else :
                raise ValueError ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            return self.stream.read ( )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                self.stream.read ( 1 )
        def read_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return self.stream.read ( 1 )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                self.stream.read ( 1 )
        def read_byte ( self ) :
            return self.stream.read ( 1 )
        def read_byte ( self ) :
            if not self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                raise StopIteration ( )
            s = [ ]
            b = read_byte ( self )
            while is_printable ( b ) :
                s.append ( b )
                b = read_byte ( self )
            return s
        def read_long ( self ) :
            if not self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                raise StopIteration ( )
            while self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                    return - 1
                else :
                    raise StopIteration (
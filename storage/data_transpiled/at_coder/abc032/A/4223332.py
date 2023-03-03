def _import ( ) :
    from sys import stdin as stream
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY2
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY3
    from .py3compat import PY2
    from .py3compat import PY3
    from .py3compat import PY3
    class FastScanner ( object ) :
        def __init__ ( self , stream , encoding = None , errors = None ) :
            self.stream = stream
        def read ( self ) :
            return self.stream.read ( )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                ptr = self.stream.read ( 1 )
                try :
                    buflen = self.stream.read ( self.stream.size ( ) )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return self.stream.read ( 1 )
            else :
                return None
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                self.stream.read ( 1 )
        def __next__ ( self ) :
            if not self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                raise StopIteration
            s = [ ]
            b = read_byte ( self )
            while self.stream.read ( 1 ) == self.stream.read ( 1 ) :
                s.append ( b )
                b = read_byte ( self )
            return s
    return FastScanner ( ).next ( )

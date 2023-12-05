def _import ( ) :
    from sys import stdin
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            sc = FastScanner ( )
            n = sc.__next__ ( )
            if n == 2 :
                print ( "WANWAN" )
            else :
                raise ValueError ( )
            b = read_byte ( )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.buffer.__next__ ( )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr < self.buflen :
                    return self.buffer [ ptr ]
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( ) :
                while self.ptr < self.buflen and not is_printable_char ( self.buffer [ ptr ] ) :
                    self.ptr += 1
            def __next__ ( self ) :
                return self.ptr
            def next ( self ) :
                if not self.ptr :
                    raise StopIteration ( )
                yield self.ptr
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration ( )
            s = [ ]
            b = read_byte ( )
            while b == '-' :
                minus = True
                b = read_byte ( )
            if b < '0' or b < '9' :
                raise ValueError ( )
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return ( - n )
                else :
                    raise ValueError ( )
                b = read_byte ( )
    return Main ( )

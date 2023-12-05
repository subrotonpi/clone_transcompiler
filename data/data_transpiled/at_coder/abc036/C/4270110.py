def _import ( ) :
    from itertools import repeat
    class Main ( object ) :
        def __next__ ( self ) :
            sc = _fast_reader ( )
            N = sc.__next__ ( )
            a = [ ]
            seen = [ ]
            for e in range ( N ) :
                a.append ( sc.__next__ ( ) )
                seen.append ( e )
            for e in seen :
                yield e
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
                        self.buflen = self.buffer.get ( self.ptr )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def __next__ ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = ptr
                    try :
                        self.buflen = self.buffer.get ( self.ptr )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def __next__ ( self ) :
                return 33 <= self.buflen
            def is_printable_char ( self ) :
                while self.ptr < self.buflen :
                    self.ptr += 1
                return False
            def __next__ ( self ) :
                if self.ptr < self.buflen :
                    raise AttributeError
                yield self.ptr
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return False
            else :
                return True
    return Main ( )

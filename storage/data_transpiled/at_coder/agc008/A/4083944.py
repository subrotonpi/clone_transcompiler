def _import ( ) :
    from sys import stdin
    from io import BytesIO
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            self.stream = sys.stdin
            x = stdin.read ( 1 )
            y = stdin.read ( 1 )
            tmp1 = x + abs ( abs ( x ) - abs ( y ) )
            if nl < int ( x ) or nl > sys.maxint :
                raise ValueError ( )
            return int ( nl )
        def next ( self ) :
            return float ( next ( self ) )
        def next ( self ) :
            return int ( next ( self ) )
        def next ( self ) :
            return float ( next ( self ) )
        def next ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return next ( self )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = BytesIO ( )
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.buffer.read ( self.buflen )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def next ( self ) :
                if not self.hasNext ( ) :
                    raise StopIteration
                self.ptr = ptr
                self.buflen = buflen
            def __next__ ( self ) :
                return 33 <= self.ptr <= 126
            def next ( self ) :
                while self.ptr < self.ptr :
                    self.ptr += 1
                return self.ptr
        def __next__ ( self ) :
            if self.ptr < self.ptr :
                raise StopIteration
            yield self.ptr
    return Main ( )

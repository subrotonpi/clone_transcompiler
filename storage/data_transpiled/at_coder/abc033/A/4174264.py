def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , K ) :
            self.K = K
        def read ( self ) :
            sc = stream.read ( self.K )
            N = sc.unpack ( '>H' ) [ 0 ]
            if N % 1111 == 0 :
                print ( 'SAME' )
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
                        buflen = stream.read ( self.buflen )
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
        def skip_unprintable ( ) :
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
        b = read_byte ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( )
        return s
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        n = 0
        minus = False
        b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        if b < '0' or b <= '9' :
            raise ValueError ( )
        while True :
            if not b in self.ptr :
                n *=
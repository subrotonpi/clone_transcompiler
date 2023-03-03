def _import ( ) : return - n if not _is_printable_char ( b ) else n
class Main ( object ) :
    def __init__ ( self ) :
        self.fastopen = _fastopen
        self.n = self.n
        self.c = self.c
        self.k = self.k
        t = [ ]
        s = [ ]
        for i in range ( self.n ) :
            t.append ( self.next ( ) )
        t.sort ( )
        for i in range ( self.n ) :
            s.append ( t [ i ] + k )
        ans = 0
        j = 0
        for i in range ( self.n ) :
            if t [ i ] <= s [ j ] and i - j + 1 <= c :
                continue
            j = i
            ans += 1
        print ( ans + 1 )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.buffer = sys.stdout.buffer
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.stream.read ( self.ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < self.ptr and not is_printable_char ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.next ( )
            while is_printable_char ( b ) :
                s.append ( b )
                b = self.next ( )
            return s
return Main

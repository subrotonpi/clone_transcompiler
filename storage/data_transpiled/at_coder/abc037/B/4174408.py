def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
        self._import ( )
        from sys import stdin
        if not self._import ( ) : raise EOFError
        N = self._read_long ( )
        if b == '-' :
            minus = True
            b = self._read_long ( )
        if b < '0' or b < '9' :
            raise ValueError ( )
        while True :
            L = self._read_long ( )
            R = self._read_long ( )
            T = self._read_long ( )
            for i in range ( L - 1 , R - 1 ) :
                A [ i ] = T
        for i in range ( N ) :
            print ( A [ i ] )
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
                    buflen = self.buffer.read ( self.buflen )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = ptr
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while self.ptr < self.buflen and not is_printable_char ( self.buffer [ ptr ] ) :
                self.ptr += 1
        def __iter__ ( self ) :
            if not self.hasNext ( ) : raise EOFError ( )
            self.buf = [ ]
    def read ( self ) :
        if self.ptr < self.buflen :
            return self.buf.pop ( )
        else :
            return self.buf.pop ( )

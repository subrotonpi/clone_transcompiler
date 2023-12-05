def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( stream ) :
        def read ( self ) :
            sc = stream.read ( 1 )
            S = sc.decode ( 'ascii' )
            L = len ( S )
            print ( S [ L - 1 ] == 'T' and 'YES' or 'NO' )
    class FastScanner ( stream ) :
        def read ( self ) :
            return sys.stdin.read ( 1 )
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
        return iter ( self )
    def next ( self ) :
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
        n = 0
        minus = False
        b = self.next ( )
        if b == '-' :
            minus = True
            b = self.next ( )
        if b < '0' or b <= '9' :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return ( - n )
            else :
                raise StopIteration
        b = self.next ( )
        return b

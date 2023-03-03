def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( stream ) :
        def read ( self ) :
            sc = stream.read
            N = sc.randint ( 0 , 10 )
            ans = 0
            for i in range ( N ) :
                ans += sc.randint ( 0 , 10 ) * sc.randint ( 0 , 21 )
            print ( ans * 21 / 20 )
    class FastScanner ( stream ) :
        def read ( self ) :
            return stream.read ( )
    buffer = StringIO ( )
    ptr = 0
    buflen = 0
    def has_next_byte ( ) :
        if ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = stream.read ( ptr )
            except AttributeError :
                pass
            if buflen <= 0 :
                return False
        return True
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def skip_unprintable ( ) :
        while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
            ptr += 1
    def __iter__ ( self ) :
        return iter ( self )
    def next ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        s = [ ]
        b = self.next ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = self.next ( )
        return s
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = self.next ( )
        if b == '-' :
            minus = True
            b = self.next ( )
        if b < '0' or '9' < b :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return ( - n ) * n
            else :
                raise StopIteration
            b = self.next ( )
        return n

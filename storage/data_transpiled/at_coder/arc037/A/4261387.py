def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( stream ) :
        def read ( self ) :
            sc = stream.read
            N = sc.find ( '-' )
            ans = 0
            for i in range ( N ) :
                m = sc.find ( '-' )
                ans += max ( 0 , 80 - m )
            print ( ans )
    class FastScanner ( stream ) :
        def read ( self ) :
            self.buffer = stream.read
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
            return self.ptr , self.buffer
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.next ( )
            while self.ptr == self.buflen :
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
            while self.ptr < self.buflen or not is_printable_char ( b ) :
                return ( - n if minus else n )
            else :
                raise StopIteration
    return Main ( )

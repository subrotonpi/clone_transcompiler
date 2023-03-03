def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream.seek ( 0 )
            n = stream.read ( 1 )
            X = stream.read ( 1 )
            a = [ ]
            for i in range ( n ) :
                if ( X >> i ) % 2 == 1 :
                    ans += ord ( X [ i ] )
            else :
                raise ValueError ( )
        def read ( self , n ) :
            if not self.hasNext ( ) :
                raise StopIteration
            return self.next ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.seek ( 0 )
        def read ( self , ptr = 0 ) :
            if self.ptr < buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream.read ( self.ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read ( self , ptr = ptr ) :
            if self.ptr < buflen :
                return self.ptr
            else :
                ptr = ptr
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.ptr < buflen and not is_printable_char ( self.ptr ) :
                ptr += 1
        def __iter__ ( self ) :
            return self.next ( )
        def next ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            yield self.next ( )
    def read ( self , n = 0 ) :
        if not self.hasNext ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = read ( )
        if b == '-' :
            minus = True
            b = read ( )
        if b < '0' or b < '9' :
            raise ValueError ( )
        while True :
            if '0' <= b <= '9' :
                n *= 10
            elif b == - 1 or not is_printable_char ( b ) :
                return ord ( b )
            else :
                raise StopIteration
        
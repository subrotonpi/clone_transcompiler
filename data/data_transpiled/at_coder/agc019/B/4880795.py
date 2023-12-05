def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        sc = _FastScanner ( )
        a = sc.next ( )
        d = { }
        n = len ( a )
        for i in range ( n ) :
            key = a [ i ]
            if key not in d :
                d [ key ] = 0
            d [ key ] = d [ key ] + 1
        res = 0
        for key in d :
            k = d [ key ]
            res += k * ( k - 1 ) // 2
        ans = n * ( n - 1 ) // 2 - res + 1
        print ( ans )
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
                        buflen = self.buffer.get ( self.ptr )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def read ( self ) :
                if self.ptr < self.buflen :
                    return self.ptr
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def __iter__ ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                    self.ptr += 1
                return self.ptr
        def readline ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.readByte ( )
            while self.ptr < self.buflen :
                s.append ( b )
                b = self.readByte ( )
            return s
        def read ( self ) :
            if self.ptr < self.buflen :
                return - 1
            return self.ptr
    return Main ( )

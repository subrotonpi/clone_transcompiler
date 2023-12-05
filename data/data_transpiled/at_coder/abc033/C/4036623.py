def _import ( ) : return _import ( )
class Main ( ) :
    def __init__ ( self ) :
        sc = _FastScanner ( )
        S = sc.next ( ).split ( )
        ans = 0
        is_zero = False
        for c in S :
            if c == '+' :
                if not is_zero :
                    ans += 1
                    is_zero = False
                elif c == '*' :
                    pass
                elif c == '0' :
                    is_zero = True
                else :
                    pass
            if not is_zero :
                ans += 1
            print ( ans )
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
        def read ( self ) :
            self.f = f
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.f.read ( self.ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < self.ptr :
                yield self.ptr
            return True
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        s = [ ]
        b = readByte ( )
        while isPrintableChar ( b ) :
            s.append ( b )
            b = readByte ( )
        return s
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        n = 0
        minus = False
        b = readByte ( )
        if b == '-' :
            minus = True
            b = readByte ( )
        if b < '0' or '9' < b :
            raise ValueError
        while True :
            if not ( b == '0' or b == '-'
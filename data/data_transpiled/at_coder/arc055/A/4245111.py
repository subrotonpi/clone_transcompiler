def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            sc = stream._FastScanner ( )
            N = sc.__next__ ( )
            print ( 1 )
            for i in range ( 1 , N ) :
                print ( 0 )
            print ( 7 )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            stream._buffer = [ ]
        def read ( self ) :
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = stream._buffer [ self.ptr ]
                    except IndexError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def readByte ( self ) :
                if self.ptr < self.buflen :
                    return self.ptr
                else :
                    return - 1
        def isPrintableChar ( self ) :
            return 33 <= self.ptr <= 126
        def skipUnprintable ( self ) :
            while self.ptr < self.buflen and not isPrintableChar ( self.ptr ) :
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
        b = self.readByte ( )
        while b == '-' :
            minus = True
            b = self.readByte ( )
        if b < '0' or b <= '9' :
            raise StopIteration
        while True :
            if self.ptr <= self.buflen :
                n *= 10
                n += b - '0'
            elif b == - 1 or not isPrintableChar ( b ) :
                return ( - n )
            else :
                raise StopIteration
            b = self.readByte ( )
    return Main

def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream.seek ( 0 )
            N = stream.read ( 1 )
            num = 0
            sum = 0
            for i in range ( N ) :
                a = stream.read ( 1 )
                if a :
                    num += 1
                    sum += a
            print ( ( sum - 1 ) / num + 1 )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.seek ( 0 )
        def read ( self , ptr = 0 ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = stream.read ( self.ptr )
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
        def isPrintableChar ( self ) :
            return 33 <= self.ptr <= 126
        def skipUnprintable ( self ) :
            while self.ptr < self.ptr + 1 and not isPrintableChar ( self.ptr + 1 ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return iter ( self )
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.readByte ( )
            while self.ptr == self.ptr + 1 :
                s.append ( b )
                b = self.readByte ( )
            return s
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            n = 0
            minus = False
            b = self.readByte ( )
            if b == '-' :
                minus = True
                b = self.readByte ( )
            if b < '0' or b <= '9' :
                raise StopIteration
            while self.ptr == self.ptr + 1 or not isPrintableChar ( b ) :
                n *= 10
                n += 1
            return n
    return Main

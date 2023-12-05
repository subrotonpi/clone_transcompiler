def import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = FastScanner ( )
        n = sc.__next__ ( )
        t = [ ]
        for i in range ( n ) :
            t.append ( sc.__next__ ( ) )
        t.sort ( )
        print ( t [ 0 ] )
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.buffer = f
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.f.read ( self.buflen )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
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
            while self.ptr < self.buflen and not isPrintableChar ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
            return self.ptr
        def next ( self ) :
            if not self.hasNext :
                raise StopIteration
            s = [ ]
            b = self.readByte ( )
            while self.isPrintableChar ( b ) :
                s.append ( b )
                b = self.readByte ( )
            return s
        def __next__ ( self ) :
            if not self.hasNext :
                raise StopIteration
            n = 0
            minus = False
            b = self.readByte ( )
            if b == '-' :
                minus = True
                b = self.readByte ( )
            if b < '0' or b > '9' :
                raise StopIteration
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not isPrintableChar ( b ) :
                    return - n if minus else n
                else :
                    raise StopIteration
                b = self.readByte
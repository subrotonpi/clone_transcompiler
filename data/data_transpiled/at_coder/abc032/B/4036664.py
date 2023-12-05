def import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        k = sc.find ( '\0' )
        seen = set ( )
        for i in range ( k , len ( s ) + 1 ) :
            seen.add ( s [ i - k : i ] )
        print ( len ( seen ) )
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
        def __init__ ( self , ptr = 0 ) :
            self.buflen = 0
        def readline ( self ) :
            self.f.readline ( )
        def has_next_byte ( self ) :
            if self.ptr < buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.f.readline ( )
                except IOError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < buflen :
                return self.ptr
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < buflen and not isPrintableChar ( self.ptr ) :
                self.ptr += 1
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def read ( self ) :
        nl = next ( self )
        if self.b == '-' :
            minus = True
            b = self.b
        if self.b < '0' or self.b > '9' :
            raise ValueError
        while True :
            if self.b == '0' or self.b <= '9' :
                n *= 10
                n += self.b - '0'
            elif self.b == - 1 or not isPrintableChar ( self.b ) :
                return - n
            else :
                raise ValueError
            b = self.b
        return self.ptr

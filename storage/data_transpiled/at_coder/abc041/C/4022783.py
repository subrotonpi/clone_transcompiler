def import struct
import sys
import struct
import sys
import struct
import sys
class Main ( struct ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = struct.calcsize ( '>i' )
        a = [ ]
        for i in range ( N ) :
            a.append ( sc.read ( 2 ) )
            a.append ( i + 1 )
        a.sort ( lambda e1 , e2 : e2 [ 0 ] - e1 [ 0 ] )
        for aa in a :
            print ( aa [ 1 ] )
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
        def __init__ ( self , ptr = 0 ) :
            self.ptr = ptr
            self.buflen = 0
        def readline ( self ) :
            self.ptr = ptr
            self.buflen = buflen
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.ptr + self.buflen
                except AttributeError :
                    pass
                if self.ptr <= 0 :
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
            while self.ptr < self.buflen and not isPrintableChar ( self.ptr ) :
                self.ptr += 1
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def __iter__ ( self ) :
        while self.ptr < self.buflen :
            yield self.ptr

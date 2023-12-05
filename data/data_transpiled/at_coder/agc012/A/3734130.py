def _import ( ) : return _import ( )
import sys
import struct
class Main ( ) :
    def __next__ ( self ) :
        sc = _FastScanner ( )
        N = sc.__next__ ( )
        a = [ sc.__next__ ( ) for i in range ( 3 * N ) ]
        a.sort ( )
        ans = 0
        for i in range ( 3 * N , 2 ) :
            ans += a [ i ]
        print ( ans )
    class Edge ( object ) :
        def __init__ ( self , to ) :
            self.to = to
            self.cost = c
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
            self.ptr = 0
            self.buflen = 0
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.buffer.__next__ ( )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.buffer [ self.ptr ]
            else :
                return - 1
        def isPrintableChar ( self ) :
            return 33 <= self.ptr <= 126
        def __iter__ ( self ) :
            while self.ptr < self.ptr :
                yield self.buffer [ self.ptr ]
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def readChar ( self ) :
        if self.ptr < self.buflen :
            return - self.ptr
        else :
            raise StopIteration
    def readChar ( self ) :
        return ''
    def readChar ( self ) :
        return ''
    def readChar ( self ) :
        return ''
    def readChar ( self ) :
        return ''
    def readChar ( self ) :
        return ''

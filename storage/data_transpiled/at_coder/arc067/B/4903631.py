def import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = FastScanner ( )
        n = sc.nextInt ( )
        a = sc.nextLong ( )
        b = sc.nextLong ( )
        x = [ sc.nextLong ( ) for i in range ( n ) ]
        dp = [ min ( dp [ i - 1 ] + a * ( x [ i ] - x [ i - 1 ] ) , dp [ i - 1 ] + b ) for i in range ( n ) ]
        print ( dp [ n - 1 ] )
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
                    buflen = self.buffer.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = self.buffer.read ( self.buflen )
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
        def isPrintableChar ( self ) :
            return 33 <= self.ptr <= 126
        def __iter__ ( self ) :
            while self.ptr < self.buflen and not isPrintableChar ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
            return True
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def __iter__ ( self ) :
        return iter ( [ ] )

def _import ( ) : return _fastopen ( )
import sys
import struct
import random
import sys
class Main ( ) :
    def __init__ ( self ) :
        self._reader = FastScanner ( )
        a = sys.stdin.read ( 1 )
        b = sys.stdin.read ( 1 )
        k = sys.stdin.read ( 1 )
        l = sys.stdin.read ( 1 )
        d1 = k / l
        d2 = int ( math.ceil ( float ( k ) / l ) )
        print ( min ( d1 * b + ( k - l * d1 ) * a , d2 * b ) )
class FastScanner ( object ) :
    def __init__ ( self , buffer ) :
        self._buffer = buffer
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self._buffer [ self.ptr ]
                except IndexError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.ptr < self.buflen :
                return self._buffer [ self.ptr ]
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < self.buflen and not is_printable_char ( self._buffer [ self.ptr ] ) :
                self.ptr += 1
            return self.ptr
        def next ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            yield self.__next__
    def __next__ ( self ) :
        nl = next ( self )
        if b == '-' :
            minus = True
            b = self._buffer [ 0 ]
        if b < '0' or b > '9' :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n
            else :
                raise StopIteration

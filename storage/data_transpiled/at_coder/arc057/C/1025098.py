def _import ( ) : return _import ( )
import sys
from io import BytesIO
import struct
from itertools import repeat
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.s = next ( )
        x = struct.unpack ( '>i' , x ) [ 0 ]
        QQ = BigInteger ( 99 )
        OH = BigInteger ( 100 )
        left = x * x
        right = x + 1 * x + 1
        while left + QQ // OH <= right :
            left = left + QQ // OH
            right = right // OH
        print ( left )
class FastScanner ( object ) :
    debug = None
    def __init__ ( self , stream ) :
        self.stream = stream
        self.ptr = 0
        self.buflen = 0
        self.buffer = BytesIO ( )
        self.eos = False
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    if self.debug :
                        self.buflen = len ( self.debug )
                        self.buffer = self.debug.getvalue ( )
                        self.debug = ""
                        self.eos = True
                    else :
                        self.buflen = self.stream.getvalue ( )
                except EOFError :
                    pass
                if self.buflen < 0 :
                    self.eos = True
                    return False
                elif self.buflen == 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.has_next_byte ( ) :
                return self.buffer [ ptr ]
            else :
                return - 1
        def is_printable_char ( self ) :
            return 33 <= self.peek ( ) <= 126
        def skip_unprintable ( self ) :
            while self.has_next_byte ( ) and not is_printable_char ( self.buffer [ ptr ] ) :
                self.ptr += 1
    return FastScanner ( )

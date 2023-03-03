def import import struct
from sys import stdout
from sys import stdin
from struct
from sys import byteorder
import struct
from struct import Struct
from sys import stdin , stdout
from struct import calcsize
from sys import byteorder
if byteorder == 'big' :
    buf = BytesIO ( )
    a = struct.unpack ( '>i' , buf ) [ 0 ]
    b = struct.unpack ( '>i' , buf ) [ 0 ]
    print ( ( a - 1 ) * byteorder + '=' + a * byteorder )
else :
    buf = BytesIO ( )
    a = struct.unpack ( '>i' , buf ) [ 0 ]
    b = struct.unpack ( '>i' , buf ) [ 0 ]
    print ( ( a - 1 ) * byteorder + '=' + a * byteorder + '=' + b * byteorder )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self , ptr = 0 ) :
        if self.stream.read ( ptr ) < self.stream.read :
            return self.stream.read ( ptr )
        else :
            self.stream.read ( ptr )
    def has_next_byte ( self ) :
        if self.stream.read ( ptr ) < self.stream.read :
            return True
        else :
            self.stream.seek ( 0 )
            return False
    def is_printable_char ( self ) :
        return 33 <= self.stream.read ( 32 ) <= 126
    def iter_bytes ( self ) :
        while self.stream.read ( ptr ) < self.stream.read ( 32 ) :
            if self.stream.read ( ptr ) == b :
                return False
            else :
                while self.stream.read ( ptr ) == b :
                    if self.stream.read ( ptr ) == b :
                        return False
                    else :
                        return True
    def is_printable_char ( self ) :
        while self.stream.read ( ptr ) < self.stream.read ( 32 ) :
            if self.stream.read ( ptr ) == b :
                return True
            else :
                return False
    def is_printable_char ( self
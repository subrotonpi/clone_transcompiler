def _import ( stream ) : return stream
import sys
import struct
import struct
import sys
import struct
import string
import struct
import sys
import struct
import string
import sys
import struct
import string
import struct
import struct
import sys
import struct
import string
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        stream = sys.stdin
        stream = sys.stdout
        self.stdin = stream
        self.stdout = stream
        self.stdin = stream
        self.stdout = stream
        self.stdout = stream
        self.stderr = stream
        self.bufsize = None
        self.next = None
    def read ( self ) :
        c = self.read ( )
        while self.is_space_char ( c ) :
            c = self.read ( )
        res = string.read ( self.bufsize )
        while not self.is_space_char ( c ) :
            res += c
        return res
    def is_space_char ( c ) :
        return c == ' ' or c == '\n' or c == '\r' or c == - 1

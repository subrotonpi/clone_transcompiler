def import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.buffer = sys.stdin.read ( 1 )
    def __init__ ( self , stream ) :
        self.stream = stream
        self.ptr = 0
        self.buflen = 0
    def read ( self , data ) :
        self.stream.seek ( 0 )
        self.stream.read ( data )
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                buflen = self.stream.read ( self.buflen )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def read_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = ptr
            try :
                buflen = self.stream.read ( self.buflen )
            except AttributeError :
                pass
            if self.ptr <= 0 :
                return False
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.ptr < 0 and not is_printable_char ( self.stream.read ( self.ptr ) ) :
            self.ptr += 1
        return self.ptr
    def __next__ ( self ) :
        if not self.hasNext :
            raise StopIteration
        s = [ ]
        b = read_byte ( self )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( self )
        return s
    def __next__ ( self ) :
        if not self.hasNext :
            raise StopIteration
        n = 0
        minus = False
        b = read_byte ( self )
        if b == '-' :
            minus = True
            b = read_byte ( self )
        if b < '0' or b > '9' :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return minus and - n or n
            else :
            INDENT
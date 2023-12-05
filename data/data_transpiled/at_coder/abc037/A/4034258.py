def import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.fp = sys.stdin
        a = min ( self.fp.read ( 1 ) , self.fp.read ( 1 ) )
        C = self.fp.read ( 1 )
        print ( C / a )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.seek ( 0 , os.SEEK_END )
        self.stream.seek ( 0 , os.SEEK_SET )
    def has_next_byte ( self ) :
        if self.stream.read ( ) < self.stream.read ( ) :
            return True
        else :
            self.stream.seek ( self.stream.read ( ) )
        if self.stream.read ( ) <= self.stream.read ( ) :
            return False
    def read_byte ( self ) :
        if self.stream.read ( ) < self.stream.read ( ) :
            return self.stream.read ( )
        else :
            return - 1
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.stream.read ( 1 ) == b :
            self.stream.seek ( 0 , os.SEEK_SET )
    def read_char ( self ) :
        if not self.stream.read ( 1 ) :
            raise StopIteration
        yield ''
        while self.stream.read ( 1 ) == b :
            self.stream.seek ( 0 , os.SEEK_SET )
        return ''
    def read_int ( self ) :
        if not self.stream.read ( 1 ) :
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
            else
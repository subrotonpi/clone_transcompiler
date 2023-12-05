def import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        AB = sc.read ( ) + sc.read ( )
        print ( 2 * int ( AB ) )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.seek ( 0 )
    def has_next_byte ( self ) :
        if self.stream.read ( ) < self.stream.tell ( ) :
            return True
        else :
            self.stream.seek ( 0 )
        if self.stream.read ( ) <= self.stream.tell ( ) :
            return False
    def read_byte ( self ) :
        if self.stream.read ( ) < self.stream.tell ( ) :
            return self.stream.read ( )
        else :
            self.stream.seek ( 0 )
        if self.stream.read ( ) <= self.stream.tell ( ) :
            return False
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.stream.read ( ptr ) < self.stream.tell ( ) :
            self.stream.seek ( ptr )
            ptr += 1
        return self.stream.read ( )
    def __next__ ( self ) :
        if not self.stream.read ( ) :
            raise StopIteration
        s = [ ]
        b = read_byte ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( )
        return s
    def __next__ ( self ) :
        if not self.stream.read ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        if b < '0' or b < '9' :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return minus and n or n
            
def _import ( ) : return ''
import sys
import string
import string
import string
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        stream = sys.stdin
        self.stream = stream
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = stream.read ( self.M )
                except IndexError :
                    pass
                if self.buflen <= 0 :
                    return False
        def read_byte ( ) :
            if self.ptr :
                return self.ptr
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while self.ptr and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return self.ptr
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def __next__ ( self ) :
        if not self.ptr :
            raise StopIteration
        s = [ ]
        b = read_byte ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( )
        return s
    def __next__ ( self ) :
        if not self.ptr :
            raise StopIteration
        n = 0
        minus = False
        b = self.next
        if b == '-' :
            minus = True
            b = self.next
        if b < '0' or '9' < b :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return minus and - n or n
            else :
                raise ValueError
            b = read_byte ( )
    class Main ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.ptr = 0
    return Main

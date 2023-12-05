def _import ( ) :
    import sys
    import struct
    import struct
    import os
    import sys
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = sys.stdin
            self.buffer = f.read ( 1024 )
            self.ptr = 0
            self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try : self.buflen = struct.unpack ( "B" , self.buffer )
                except struct.error : pass
                if self.buflen <= 0 :
                    return False
        def read_byte ( self ) :
            if self.has_next_byte ( ) :
                return self.buffer [ self.ptr ]
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.has_next_byte ( ) and not is_printable_char ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
            return self.ptr
        def read_long ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            s = [ ]
            b = read_byte ( self )
            while is_printable_char ( b ) :
                s.append ( b )
                b = read_long ( self )
            return s
        def read_long ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            n = 0
            minus = False
            b = read_byte ( self )
            if b == '-' :
                minus = True
                b = read_byte ( self )
            if b < '0' or b <= '9' :
                raise ValueError
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return - n if minus else n
                else :
                    raise ValueError
                b = read_byte ( self )
            return self.ptr
    class BinarySearch ( FastScanner ) :
        def __init__ ( self , f ) :
            self.f = f
    return BinarySearch

def _import ( ) :
    from sys import stdin as stream
    from binascii import hexlify
    from binascii import b2a_uu
    from itertools import repeat
    from binascii import unhexlify
    from itertools import repeat
    N = len ( stream.read ( ) )
    a = [ ]
    for i in range ( N ) :
        a.append ( stream.read ( ) )
    ans = 0
    stack = 0
    for i in repeat ( N ) :
        if a [ i ] == 0 :
            ans += stack / 2
            stack = 0
        else :
            stack += a [ i ]
    ans += stack / 2
    print ( ans )
class FastScanner ( object ) :
    def __init__ ( self , stream , buffer ) :
        stream = sys.stdin
        self.buffer = buffer
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = stream.read ( self.ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def read ( self ) :
        if self.ptr < self.buflen :
            return - 1
        else :
            raise StopIteration
    def decode ( self ) :
        s = [ ]
        b = read_byte ( self )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( self )
        return s

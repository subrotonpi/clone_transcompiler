def _import ( ) :
    from time import sleep
    from itertools import repeat
    fac = range ( 200001 )
    mod = 1000000007
    def main ( ) :
        sc = FastScanner ( )
        N , T = sc.next ( )
        A = repeat ( N , T )
        if not hasNext ( ) :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return int ( minus ) - n
            else :
                raise StopIteration
        b = read_byte ( )
    def read ( ) :
        if not hasNext ( ) :
            raise StopIteration
        while True :
            b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        if b < '0' :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return int ( minus ) - n
            else :
                raise StopIteration
        return int ( ans )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
        def __init__ ( self , ptr = 0 ) :
            self.buflen = 0
        def has_next_byte ( ) :
            if ptr < self.buflen :
                return True
            else :
                self.buflen = 0
                try :
                    self.buflen = read_byte ( )
                except EOFError :
                    pass
                if len ( self.buflen ) <= 0 :
                    return False
            return True
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while has_next_byte ( ) and not is_printable_char ( self.buffer [ ptr ] ) :
                ptr += 1
        def next ( ) :
            if not hasNext ( ) :
                raise StopIteration
            yield int ( b )
    return FastScanner ( ).next ( )

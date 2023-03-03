def _import ( ) :
    import sys
    import string
    import string
    import io
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self._import ( )
    N = sc.__next_in_int ( )
    M = sc.__next_in_int ( )
    Q = sc.__next_in_int ( )
    def has_next_byte ( ) :
        if self._any_bytes :
            return self._any_bytes
        else :
            ptr = 0
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def is_eos ( ) :
        while has_next_byte ( ) and not is_printable_char ( c ) :
            ptr += 1
    def next ( ) :
        if not is_eos ( ) :
            raise StopIteration
        s = [ ]
        b = read_byte ( )
        while is_printable_char ( b ) :
            s.append ( b )
        return s
    def next_long ( ) :
        if not is_eof ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        if b < '0' or b <= '9' :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if n else n
            else :
                raise ValueError
            b = read_byte ( )
        def next_long_list ( n ) :
            return next ( )
        for i in range ( 1 , M + 1 ) :
            v [ i ] [ j ] += next_long_list ( 1 , n ) [ 0 ]
        for i in range ( 1 , M + 1 ) :
            ret = [ ]
            for j in range ( 1 , M + 1 ) :
                ret.append ( next ( ) )
            return ret
    return Main

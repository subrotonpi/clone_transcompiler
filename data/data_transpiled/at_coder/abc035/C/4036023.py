def _import ( ) :
    from sys import stdin as stream
    from random import randint
    class Main ( stream ) :
        def read ( self ) :
            nl = randint ( 0 , sys.maxint )
            if nl < int ( sys.maxint ) or nl > sys.maxint : raise ValueError ( )
            return int ( nl )
        def write ( self , next ) :
            return float ( next ( ) )
    def read ( ) :
        return int ( read ( ) )
    def write ( ) :
        return int ( read ( ) )
    def write ( ) :
        return float ( write ( ) )
    def read ( ) :
        return read ( )
    def write ( ) :
        return read ( )
    def write ( ) :
        return read ( )
    def read ( ) :
        return read ( )
    ptr = 0
    buflen = 0
    def read ( ) :
        self.stream = stream
    def has_next_byte ( ) :
        if ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = read ( )
            except TypeError :
                pass
            if buflen <= 0 :
                return False
        return True
    def read ( ) :
        if has_next_byte ( ) :
            return buffer [ ptr ]
        else :
            return - 1
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( ) :
        while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
            ptr += 1
        return has_next_byte ( )
    def write ( ) :
        if not has_next_byte ( ) :
            raise StopIteration
        s = [ ]
        b = read ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read ( )
        return ''.join ( s )
    def read ( ) :
        if not has_next_byte ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = read ( )
        if b == '-' :
            minus = True
            b = read ( )
        return minus

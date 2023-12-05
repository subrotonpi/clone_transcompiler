def _import ( ) : return 33 <= c <= 126
def skip_unprintable ( ) :
    while has_next_byte ( ) and not is_printable_char ( ) :
        ptr += 1
    def next ( ) :
        return ord ( 'a' )
    def read ( ) :
        while has_next_byte ( ) :
            ptr += 1
        return [ ]
    def write ( ) :
        while has_next_byte ( ) :
            ptr += 1
        return write ( )
    def read ( ) :
        if not has_next_byte ( ) :
            raise StopIteration
        s = [ ]
        while is_printable_char ( s ) :
            s.append ( s.pop ( ) )
        return s
    def write ( ) :
        if not has_next_byte ( ) :
            raise StopIteration
        n = 0
        b = read_byte ( )
        if b == '-' :
            minus = True
        elif b == - 1 or not is_printable_char ( b ) :
            return ( - n if minus else n )
        else :
            raise StopIteration
        b = read_byte ( )
        while b == '-' :
            minus = True
        if b == '-' :
            n *= 10
        elif b == - 1 or not is_printable_char ( b ) :
            return ( - n if minus else n )
    def write ( ) :
        if not has_next_byte ( ) :
            raise StopIteration
        while b == '-' :
            n += 1
        return write ( )
    def write ( ) :
        while has_next_byte ( ) :
            b = read_byte ( )
            if b == '-' :
                minus = True
            elif b == - 1 or not is_printable_char ( b ) :
                return ( - n if minus else n )
            else :
                raise StopIteration
        b = read_byte ( )
        return write ( )
    def read ( ) :
        while has_next_byte ( ) :
            ptr += 1
        return write ( )
    def write ( ) :
        while has_next_byte ( ) :
            ptr += 1
        return write ( )
    return read ( )

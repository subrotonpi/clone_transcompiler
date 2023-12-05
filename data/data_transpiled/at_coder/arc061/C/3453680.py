def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._import ( )
        sc = FastScanner ( )
        n = sc.read ( )
        m = sc.read ( )
        self._graph = [ ]
        self._id_map = { }
        if not self._has_next_byte ( ) :
            return - n if n <= '9' else n
        else :
            raise ValueError ( )
        b = read_byte ( )
    def read ( ) :
        if not self._has_next_byte ( ) :
            raise StopIteration ( )
        n = 0
        if b == '-' :
            minus = True
            b = read_byte ( )
        else :
            ptr = read_byte ( )
        if b == '-' :
            n *= 10
            n += b - '0'
        elif b == - 1 or not is_printable_char ( b ) :
            return - n if n <= 126 else n
        return b
    def write ( ) :
        while b in self._graph :
            b = read_byte ( )
        return b
    def write ( ) :
        while b in self._graph :
            b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        else :
            ptr = read_byte ( )
        if b == '-' :
            return - 1 if b < '' else b
        return int ( b )
    def write ( ) :
        return float ( self._graph [ b ] )
    def write ( ) :
        return b
    def write ( ) :
        while b in self._graph :
            b = read_byte ( )
            if b == '-' :
                minus = True
                b = read_byte ( )
            else :
                ptr = read_byte ( )
            if b == '' :
                return - 1 if b <= 126 else b
    def write ( ) :
        return b
    def write ( ) :
        return write ( b )

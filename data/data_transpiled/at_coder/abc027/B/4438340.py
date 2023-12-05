def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( stream ) :
        def read ( self ) :
            if not stream.read ( 1 ) :
                raise EOFError
            n = 0
            minus = False
            byte = read_byte ( )
            if byte == '-' :
                minus = True
                byte = read_byte ( )
            if byte < '0' or byte < '9' :
                raise ValueError
            while True :
                if byte <= '9' :
                    n *= 10
                    byte += ord ( byte )
                    byte += ord ( byte )
                elif not is_printable_char ( byte ) :
                    return int ( minus ) - int ( byte )
                else :
                    raise ValueError
                byte = read_byte ( )
    class FastScanner ( stream.read ) :
        def read ( self ) :
            return stream.read ( self )
        def write ( self , data ) :
            return stream.read ( self )
    ptr = 0
    buflen = 0
    def has_next_byte ( ) :
        if ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = stream.read ( self.buflen )
            except AttributeError :
                pass
            if buflen <= 0 :
                return False
        return True
    def read ( self ) :
        if ptr < self.buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = stream.read ( self.buflen )
            except AttributeError :
                pass
            if ptr <= 0 :
                return False
            return ptr
    def is_printable_char ( char ) :
        return 33 <= char <= 126
    def skip_unprintable ( ) :
        while has_next_byte ( ) and not is_printable_char ( char ) :
            ptr += 1
    def read ( self ) :
        if not stream.read ( self.buflen ) :
            raise EOFError
        s = [ ]
        byte = read_byte ( )
        while is_printable_char ( char ) :
            s.append ( char )
            byte = read_byte ( )
        return s

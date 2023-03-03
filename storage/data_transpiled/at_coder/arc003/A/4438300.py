def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def read ( self ) :
            if not hasNext ( ) : raise StopIteration
            n = 0
            minus = False
            byte = read_byte ( )
            if byte == '-' :
                minus = True
                byte = read_byte ( )
            if byte < '0' or byte <= '9' :
                raise ValueError
            while byte == '-' or not is_printable_char ( byte ) :
                return int ( minus ) - n
            else :
                raise ValueError
            byte = read_byte ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream = stream.read ( 1024 )
        def read ( self , ptr = 0 ) :
            if ptr < self._buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream.read ( self._buflen )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read ( self , ptr = ptr ) :
            if ptr < self._buflen :
                return True
            else :
                ptr = ptr
                try :
                    return self._buflen [ ptr ]
                except AttributeError :
                    pass
        def startswith ( self ) :
            return 33 <= ord ( self._buflen [ 0 ] )
        def skip_unprintable ( self ) :
            while self._buflen and not is_printable_char ( self._buflen [ 0 ] ) :
                ptr += 1
        def startswith ( self ) :
            return self._buflen [ 0 ]
        def decode ( self ) :
            if not hasNext ( ) : raise StopIteration
            s = [ ]
            byte = read_byte ( )
            while is_printable_char ( self._buflen [ 0 ] ) :
                s.append ( byte )
                byte = read_byte ( )
            return s
    return Main ( )

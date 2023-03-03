def _import ( ) :
    from sys import stdin as stream
    from .util import is_printable
    class Main ( stream ) :
        def read ( self ) :
            if not stream.read ( 1 ) :
                raise EOFError ( )
            n = 0
            minus = False
            byte = read_byte ( )
            if byte == '-' :
                minus = True
                byte = read_byte ( )
            if byte < '0' or byte == '9' :
                raise ValueError ( )
            while True :
                if '0' <= byte <= '9' :
                    n *= 10
                    byte += ord ( byte ) - 1
                elif byte == - 1 or not is_printable ( byte ) :
                    return int ( minus ) - n
                else :
                    raise ValueError ( )
                byte = read_byte ( )
            return int ( P [ 0 ] )
    def read ( self ) :
        return stream.read ( self )
    def write ( self , data ) :
        return stream.read ( self )
    def read ( self ) :
        return stream.read ( self )
    def write ( self , data ) :
        return stream.read ( self )
    def write ( self , data ) :
        return stream.read ( self )
    def read ( self ) :
        return stream.read ( self )
    def write ( self , data ) :
        return stream.read ( self )
    def write ( self , data ) :
        return stream.read ( self )
    def read ( self ) :
        return stream.read ( self )
    def write ( self , data ) :
        return stream.read ( self )
    def read ( self ) :
        return stream.read ( self )
    def write ( self , data ) :
        return stream.write ( data )

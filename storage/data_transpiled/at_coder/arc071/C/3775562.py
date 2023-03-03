def _import ( ) : return _import ( "" , "" )
class Main ( object ) :
    def __init__ ( self ) :
        self._import ( )
        from sys import stdout
        from .hexversion import ( __version__ , __version__ , __detect_encoding )
        from .hexversion import ( __version__ , __version__ , __detect_encoding )
    def read ( self ) :
        S = self._import ( )
        T = self._import ( )
        x = len ( S )
        y = len ( T )
        s = [ ]
        t = [ ]
        for i in range ( 1 , x + 1 ) :
            s.append ( s [ i - 1 ] + S [ i - 1 ] + 1 - 'A' )
        for i in range ( 1 , y + 1 ) :
            t.append ( t [ i - 1 ] + T [ i - 1 ] + 1 - 'A' )
        q = self._import ( )
        for i in range ( q ) :
            a , b , c , d = self._unpack ( '>BBBB' , s [ i ] )
            if ( s [ b ] - s [ a - 1 ] ) % 3 == ( t [ d ] - t [ c - 1 ] ) % 3 :
                print ( "YES" )
            else :
                print ( "NO" )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self._import ( )
        self._buffer = [ ]
        self._ptr = 0
        self._buflen = 0
        def _has_next_byte ( self ) :
            if self._ptr < self._buflen :
                return True
            else :
                self._ptr = 0
                try :
                    self._buffer.append ( self._ptr )
                except AttributeError :
                    pass
                if self._ptr <= 0 :
                    return False
            return True
        def _has_next_byte ( self ) :
            if self._ptr < self._buflen :
                raise StopIteration
            else :
                self._buffer = [ ]
    def _is_print_char ( self ) :
        while self._ptr < self._ptr :
            self._buffer.append ( self._ptr )
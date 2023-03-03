def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._import ( )
        from .import scanner as _scanner
        if self._import ( ) or self._import ( ) : raise ValueError
    def next ( self ) :
        return _scanner.next ( )
    def double ( self ) :
        return float ( next ( ) )
    def K ( self ) :
        return set ( [ a , b ] )
    def __iter__ ( self ) :
        for i in range ( K ) :
            P = _scanner.next ( )
            if P in self._import ( ) :
                print ( "NO" )
                return
            self._import ( )
            self._import ( )
        print ( "YES" )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.seek ( 0 )
    def has_next_byte ( self ) :
        if self.ptr < self.stream.seek ( 0 ) :
            return True
        else :
            self.ptr = 0
            try :
                buflen = self.stream.read ( self.stream.limit ( ) )
            except AttributeError :
                pass
            if buflen <= 0 :
                return False
            return True
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.ptr < len ( self.stream.read ( self.stream.limit ( ) ) ) :
            self.stream.write ( c )
    def next ( self ) :
        if not self.stream.seek ( 0 ) :
            raise StopIteration
        yield self.stream.read ( self.stream.limit ( ) )

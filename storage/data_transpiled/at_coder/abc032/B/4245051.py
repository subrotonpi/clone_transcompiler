def _import ( ) :
    from StringIO import StringIO
    from Python.core import FastScanner
    class Main ( FastScanner ) :
        def read ( self ) :
            sc = FastScanner ( )
            S = sc.next ( )
            k = len ( sc.next ( ) )
            L = len ( S )
            seen = set ( )
            for i in range ( L - k + 1 ) :
                seen.add ( S [ i : i + k ] )
            print ( len ( seen ) )
    Note :._import ( )._import ( )
    from Python.core import core
    from Python.core import exceptions
    class FastScanner ( object ) :
        def read ( self ) :
            self._import ( )
            return sys.stdin.read ( )
    def read ( self ) :
        ptr = 0
        buflen = 0
        def has_next_byte ( ) :
            if ptr < buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = len ( self._import ( ).buffer )
                except TypeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read ( self ) :
            if ptr < buflen :
                return self._ptr
            else :
                ptr = ptr
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while has_next_byte ( ) and not is_printable_char ( self._ptr ) :
                ptr += 1
        def __iter__ ( self ) :
            return iter ( self )
        def next ( self ) :
            if not hasNext ( ) :
                raise StopIteration
            s = [ ]
            b = self._ptr
            while is_printable_char ( b ) :
                s.append ( b )
                b = self._ptr
            return s
    def read ( self ) :
        if not hasNext ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = self._ptr
        if b == '-' :
            minus = True
            b = self._ptr
        if b < '0' or b <= '9' :
            raise ValueError
        while True :
            if not hasNext (
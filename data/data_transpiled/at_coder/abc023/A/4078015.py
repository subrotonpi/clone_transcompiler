def _import ( ) :
    from StringIO import StringIO
    from sys import stdin
    from random import randrange
    from random import randrange
    from sys import stdout
    from sys import stderr
    from termios import tcgetattr
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    from struct import Struct
    ptr = 0
    buflen = 0
    def read ( ) :
        self._in = Struct ( )
    def has_next_byte ( ) :
        if ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = Struct ( ).unpack ( "\0" , self._in ) [ 0 ]
            except struct :
                pass
            if buflen <= 0 :
                return False
        return True
    def read ( ) :
        if has_next_byte ( ) :
            return self._in [ ptr ]
        else :
            ptr += 1
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( ) :
        while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
            ptr += 1
        return ptr
    def read ( ) :
        if not hasNext ( ) :
            raise StopIteration
        s = [ ]
        b = read ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read ( )
        return s
    def read ( ) :
        nl = read ( )
        if nl < int ( nl ) or nl > sys.maxsize :
            raise SyntaxError
        return int ( nl )
    def write ( ) :
        s.append ( b )
    return write

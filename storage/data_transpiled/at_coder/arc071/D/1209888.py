def _import ( stream ) : return stream.read ( )
def _import ( ) : return _import ( )
def _import ( ) :
    MOD = 1000000007
    def _main ( ) :
        f = _import ( )
        f = _import ( )
        n = f.read ( 1 )
        if f.read ( 1 ) == '-' :
            c = f.read ( 1 )
        else :
            c = f.read ( 1 )
        if c == '-' :
            sgn = - 1
            c = next ( f )
        res = [ ]
        while True :
            if c < '0' or c > '9' :
                raise InputError ( )
            res *= 10
            res += c - '0'
        if c <= 'Z' :
            return c
        raise InputError ( )
    def _next ( ) :
        c = next ( f )
        if c == ' ' :
            sgn = - 1
        else :
            sgn = 0
        res = [ ]
        while True :
            if c < '0' or c > '9' :
                raise InputError ( )
            res *= 10
            res += c - '0'
        if c == '\n' or c == '\r' or c == '\t' or c == - 1 :
            return
    def _interface ( ch ) :
        return ch
    def debug ( * o ) :
        sys.stderr.write ( "".join ( str ( o ) for o in o ) )
    def _debug ( * o ) :
        return _import ( )
    def _internal ( ) :
        return _internal ( )
    def _internal ( ) :
        return _internal ( )
    def _internal ( ) :
        return _internal ( )
    def _internal ( ) :
        return _internal ( )

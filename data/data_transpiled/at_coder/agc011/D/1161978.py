def _import ( ) : return _import ( )
def _import ( stream , stream , num_chars ) : return [ ]
def _import ( ) : return _import ( )
def _import ( ) : return _import ( )
def _import ( ) :
def _import ( ) :
    f = _import ( )
    f = _import ( )
    n = len ( f )
    k = len ( f )
    while is_space_char ( c ) :
        c = next ( f )
    def _next ( ) :
        if c < '0' or c > '9' :
            raise InputError ( )
        res = [ ]
        for i in range ( 3 * n ) :
            res.append ( next ( f ) )
        return res
    def _next ( ) :
        c = next ( )
        while is_space_char ( c ) :
            c = next ( f )
        if c == '-' :
            sgn = - 1
            c = next ( f )
        head = 0
        flg = 0
        m = min ( k , 2 * n )
        for i in range ( m ) :
            if ( arr [ head ] ^ flg ) == 0 :
                arr [ head ] ^= 1
            else :
                head += 1
                flg ^= 1
                arr [ head + n - 1 ] = flg
        return c == ' ' or c == '\n' or c == '\r' or c == - 1
    def debug ( * o ) :
        print ( [ str ( o ) for o in o ] )
        f.flush ( )
    def doit ( i , dir = 0 ) :
        if i < 0 or i >= len ( s ) :
            return dir
        if s [ i ] == 'A' :
            s [ i ] = 'B'
            return doit ( i - dir , - 1 )
        else :
            s [ i ] = 'A'
            return doit ( i + dir , dir )
    return _import ( )

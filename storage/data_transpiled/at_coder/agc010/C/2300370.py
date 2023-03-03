def _import ( ) : return sys.stderr.write
def main ( ) : return sys.stderr.write
def _import ( ) : return sys.stderr.write
def _import ( ) : return sys.stderr.write
def _debug ( * o ) :
    def _readline ( ) :
        f = _import ( sys.stdin , sys.stdout )
        f = _import ( sys.stderr , sys.stdout )
        n = f.read ( 1 )
        a = [ ]
        for i in range ( n ) :
            a.append ( f.read ( 1 ) )
        if not _is_space_char ( c ) :
            raise InputError ( )
        if c in '-' :
            sgn = - 1
        res = 0
        while True :
            if c < '0' or c > '9' :
                raise InputError ( )
            res *= 10
            res += c - '0'
        if not _is_space_char ( c ) :
            return res * sgn
        return _readline ( )
    def _debug ( ) :
        return _debug ( )
    def _readline ( ) :
        c = _skip_while_space ( )
        while True :
            c = _readline ( )
            if c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == - 1 :
                return c
        graph = _build_graph ( _readline , n , n - 1 )
        print ( 'YES' if _is_ok ( c ) else 'NO' )
        f.flush ( )
    def _debug ( n ) :
        is_ok = True
        if n == 2 :
            return a [ 0 ] == a [ 1 ]
        for i in range ( n ) :
            if len ( graph [ i ] ) >= 2 :
                root = _dfs ( i , - 1 ) == 0
                is_ok &= root
                break
        return is_ok
    def _dfs ( now , par ) :
        has = False
        upsum = 0
        max = 0
        for to in graph [ now ] :
            if to == par :
                continue
            has = True
            l = _dfs ( to , now )
            max = max
            yield l
    graph = _dfs ( )
    
def _import ( stream ) : return stream.read ( )
def _import ( stream , _reader ) : return _reader
def _unpack_long_table ( n , m ) :
    ret = [ ]
    for i in range ( n ) :
        for j in range ( m ) :
            ret.append ( _unpack ( i ) )
    def _unpack_floats ( n ) :
        ret = [ ]
        for i in range ( n ) :
            ret.append ( _unpack_floats ( n ) )
        return res * sgn
    def _unpack_floats ( n ) :
        c = next ( )
        while c == '-' :
            c = next ( )
        c = next ( )
        sgn = 1
        for i in range ( n - 1 ) :
            a [ i ] -= 1
        return c
    def _next ( ) :
        c = next ( )
        while c == '-' :
            c = next ( )
        c = next ( )
        if c == '-' :
            sgn = - 1
        c = next ( )
    def _next ( ) :
        c = next ( )
        if c == '-' :
            return - 1
        return c
    graph = [ _next ( ) ]
    for i in range ( n ) :
        graph [ i ] = _next ( )
    def _next ( ) :
        for i in range ( n ) :
            graph [ i ].append ( _next ( ) )
    def _next ( ) :
        for i in range ( n ) :
            if c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == - 1 :
                return next ( )
    def _unpack_floats ( n ) :
        for i in range ( n ) :
            ret.append ( _next ( ) )
    def _next ( ) :
        c = next ( )
        if c == '-' :
            return - 1
        return _unpack_floats ( n )
    def _next ( ) :
        c = next ( )
        while c == '-' :
            c = next ( )
        return _next ( )
    graph = [ _next ( ) ]
    return graph
    
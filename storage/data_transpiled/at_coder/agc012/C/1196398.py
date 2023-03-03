def _import ( stream ) : return stream.read ( )
def _import ( stream , stream ) : return stream.read ( )
def _import ( stream , stream ) : return stream.read ( )
def _import ( stream , stream ) : return stream.read ( )
def _import ( stream , stream ) :
    def _import ( ) :
        stream = stream.read ( )
        stream.write ( stream.write ( stream.write ( stream.read ( ) ) ) )
    def _next ( ) :
        c = next ( )
        while is_space_char ( c ) :
            c = next ( )
        if c == '-' :
            sgn = - 1
            c = next ( )
        res = [ ]
        while not is_space_char ( c ) :
            c = next ( )
        res = [ ]
        while is_space_char ( c ) :
            c = next ( )
        res.append ( c )
        if c == '-' :
            sgn = - 1
            c = next ( )
        res = [ ]
        while is_space_char ( c ) :
            c = next ( )
        if c == '-' :
            sgn = - 1
            c = next ( )
        res = [ ]
        while is_space_char ( c ) :
            c = next ( )
        res.append ( c )
        if c in ( ' ' , '\n' , '\r' , '\t' ) :
            res.append ( c )
        for i in range ( 1 , baselen - 1 ) :
            res.append ( i )
    def _debug ( * o ) :
        sys.stderr.write ( "".join ( o ) )
    for c in _import ( ) :
        _import ( )
    return _import ( )

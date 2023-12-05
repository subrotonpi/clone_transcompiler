def main ( ) :
    n = ni ( )
    b = na ( n )
    ret = solve ( b )
    if ret is None :
        print ( - 1 )
    else :
        for v in ret :
            out ( v )
    def ntable ( n , m ) :
        table = [ ]
        for i in range ( m ) :
            table.append ( ni ( ) )
        return table
    def tr ( * x ) :
        if x is not sys.stdin :
            print ( _repr ( x ) )
        return None
    def nlist ( n , m ) :
        table = [ ]
        for i in range ( m ) :
            table.append ( ni ( ) )
        return table
    def tr ( * x ) :
        if x is not sys.stdin :
            print ( _repr ( x ) )
        return None
    def tr ( * x ) :
        if x is not sys.stdin :
            return None
        c = [ ]
        p = 0
        for k in range ( m ) :
            if k == arg :
                continue
            c.append ( x )
        ptr -= 1
        b = c
        m -= 1
        return ret
    def main ( ) :
        with threading.Lock ( None ) :
            start = time.time ( )
            debug = sys.argv [ 1 ] if len ( sys.argv ) > 1 else None
            if debug :
                try :
                    fp = _open ( sys.argv [ 1 ] , 'r' )
                except :
                    raise
            reader = _reader ( fp , 'r' , 32768 )
            solve ( )
            out.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    return sys.stdout

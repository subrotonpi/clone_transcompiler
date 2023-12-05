def Main ( ) :
    n = ni ( )
    a = nal ( n )
    ret = 0
    while 1 :
        s = 0
        for i in range ( n ) :
            s += a [ i ] / n
        if s == 0 : break
        ret += s
        for i in range ( n ) :
            table [ i ] = ni ( )
    def tr ( * o ) :
        if o != sys.stdin :
            print ( _repr ( o ) )
    print ( ret )
    def main ( ) :
        start = time.time ( )
        debug = sys.argv [ 1 ] if debug else None
        if debug :
            with _open ( _sys.argv [ 1 ] , 'r' ) as f :
                f.seek ( 0 )
        reader = _sys.stdin.readlines ( )
        solve ( )
        out.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def tr ( * o ) :
        if o == sys.stdin or not o :
            with _sys.stdout.readlines ( ) :
                return
        return ''
    def tr ( * o ) :
        if o == sys.stdin :
            return
    def tr ( * o ) :
        if o == sys.stdout :
            return
        return ''
    def tr ( * o ) :
        if o == sys.stdin :
            return
        return ''
    def tr ( * o ) :
        if o == sys.stdin :
            return
        try :
            reader = _sys.stdin.readlines ( )
            reader = _sys.stdout.readlines ( )
            reader.close ( )
        except :
            reader = _sys.stdin.readlines ( )
            reader = _sys.stdout.readlines ( )
            reader.close ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    tr ( * o )
return main

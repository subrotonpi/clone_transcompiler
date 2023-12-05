def _ _ init _ _ ( ) :
    from sys import argv
    if argv.count ( '.' ) < 1 :
        print ( 'Usage: <fn_in>' )
    fn = argv.pop ( 0 )
    fn_out = to_fn_out ( fn )
    with open ( fn , 'r' ) as f :
        with open ( fn_out , 'w' ) as f :
            lines = f.readlines ( )
    NCase = sum ( [ int ( x.strip ( ) ) for x in lines ] )
    stime = time.time ( )
    for icase in range ( NCase ) :
        a = to_tuple ( lines [ icase ] )
        buf = process ( a [ 0 ] , a [ 1 ] )
        out = 'Case #%d: %s' % ( icase + 1 , buf )
        f.write ( out )
        f.write ( '\n' )
        ctime = time.time ( )
        print ( '--- Done: #%2d,%3.0fs, ends in:%2.1fm' % ( icase + 1 , ( ctime - stime ) * 0.001 , ( ctime - stime ) * 0.001 / 60 * NCase / ( icase + 1 ) ) )
    def process ( N , K ) :
        x = ( 1 << N )
        while K >= x :
            K %= x
        if K == x - 1 :
            return 'ON'
        return 'OFF'
    def to_tuple ( line ) :
        p = line.strip ( ).split ( 's+' )
        out = [ int ( x ) for x in p ]
        return out
    def to_fn_out ( fn ) :
        if fn.rfind ( '.' ) != - 1 :
            return fn [ : fn.rfind ( '.' ) ] + ".out"
        else :
            return fn + ".out"
    return process ( N , K )

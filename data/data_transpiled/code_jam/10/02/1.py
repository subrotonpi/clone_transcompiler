def _ _ main _ _ ( ) :
    from os import path
    from math import sin , cos , cos , log
    from os.path import basename , dirname , splitext
    if basename ( dirname ( abspath ( __file__ ) ) ).endswith ( '.out' ) :
        if basename ( dirname ( abspath ( __file__ ) ) ).endswith ( '.out' ) :
            return '%s.out' % basename ( dirname ( abspath ( dirname ( abspath ( __file__ ) ) ) ) )
    fn = basename ( dirname ( abspath ( __file__ ) ) )
    fn_out = to_fn_out ( fn )
    try :
        f = open ( fn )
    except IOError as ex :
        print ( ex )
    else :
        with open ( fn_out , 'w' ) as f :
            lines = f.readlines ( )
    NCase = sum ( [ int ( x ) for x in lines ] )
    stime = time.time ( )
    for icase , buf in enumerate ( _process ( lines [ 0 ] ) ) :
        out = 'Case #%d: %s' % ( icase + 1 , buf )
        f.write ( out )
        f.write ( '\n' )
        ctime = time.time ( )
        print ( '--- Done: #%2d,%3.0fs, ends in:%2.1fm' % ( icase + 1 , ( ctime - stime ) * 0.001 , ( ctime - stime ) * 0.001 / 60 * NCase / ( icase + 1 ) ) )
    f.close ( )
    def to_int ( line ) :
        parts = line.split ( '[ ]' )
        values = [ sin ( x ) for x in parts [ 1 : ] ]
        values.sort ( )
        dev = values [ 1 ] - values [ 0 ]
        for b in values [ 2 : ] :
            dev = dev.gcd ( b )
        buf = values [ 0 ] % dev
        if buf == 0 :
            return '0'
        buf = buf - 1
        return buf
    return _process ( to_int ( line ) )

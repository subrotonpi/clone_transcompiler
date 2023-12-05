def _import ( ) :
    from os import system , io
    from time import sleep
    from os.path import join
    from os import sep
    from os.path import join
    class A :
        def read ( sc ) :
            R , C , W = select.select ( [ join ( 'R' , 'C' ) ] )
            def solve ( ) :
                res = R * ( C // W )
                if C % W :
                    res += 1
                res += W - 1
                return res
            def debug ( * args ) :
                sys.stderr.write ( "%s\n" % deeprepr ( args ) )
        def __ID ( self ) :
            return self.__ID
        def __ERROR ( self ) :
            return False
    def debug ( * args ) :
        sys.stderr.write ( "%s\n" % deeprepr ( args ) )
    pN = 1
    if not args :
        try :
            sys.stdin = io.open ( A.__name__ + ".in" , "r" )
        except :
            pass
    else :
        pN = int ( args [ 0 ] )
    out = sys.stdout
    sys.stdout = None
    with open ( A.__name__ + ".out" , "w" ) as sc :
        _ , _ , _ , solvers = _import ( A , [ ] , [ ] , [ ] , sys.stdout )
        outs = [ ]
        for i in range ( case_n ) :
            solvers.append ( A ( ) )
            outs.append ( io.StringIO ( ) )
            solvers [ i ].out.write ( "Case #%d: " % ( i + 1 ) )
            solvers [ i ].read ( sc )
    ts = [ Thread ( target = lambda : _import ( * [ A ( ) ] ) ) for _ in range ( pN ) ]
    ts.append ( threading.Thread ( target = lambda : _import ( * [ A ( ) ] ) ) )
    ts.start ( )
    for i in range ( pN ) :
        for _ in range ( case_n ) :
            with open ( A.__name__ + ".out" , "w" ) as sc :
                if i
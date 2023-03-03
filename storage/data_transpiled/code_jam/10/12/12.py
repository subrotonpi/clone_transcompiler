def package ( gcj2010 ) :
    import gcj2010
    import gcj2010
    import os
    import os.path
    import time
    import sys
    import os.path
    import time
    import termios
    import time
    import sys
    start = time.time ( )
    if MODE :
        f = open ( INPATH , 'r' )
        sc = sys.stdin
        n = sc.readline ( ).split ( ) [ 0 ]
        self._tr = lambda * args : [ ( n , 0 , 0 , 0 ) ]
    else :
        f = OUTPATH + "%s.txt"
        self._tr = lambda * args : [ ( n , 0 , 0 , 0 ) ]
    def _tr ( * args ) :
        for e in args :
            print ( "case %d: %s\n" % ( i + 1 , e ) )
    def _tr ( * args ) :
        f = open ( OUTPATH , 'w' )
        f.write ( self._tr ( * args ) )
    def _tr ( * args ) :
        for e in args :
            print ( "%d solved.\t%s" % ( i + 1 , e ) )
    f = _tr
    try :
        for i in range ( k ) :
            _tr ( f , n )
    except :
        pass
    else :
        f = _tr
    print ( _tr ( * args ) )

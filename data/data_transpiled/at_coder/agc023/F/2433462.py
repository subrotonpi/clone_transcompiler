def _main ( args ) :
    import time
    import sys
    import os
    import sys
    import getopt
    import getopt
    class Main ( object ) :
        def __init__ ( self , func ) :
            self.start = time.time ( )
            debug = args [ 0 ] if debug else None
            if self.debug :
                try :
                    fp = open ( self.filename , 'rb' )
                except :
                    raise
            self.write ( fp.read ( ) , '' )
            self.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
        def readline ( self ) :
            return self.start
    def _ntable ( n , m ) :
        a = [ ]
        for i in range ( n ) : a.append ( nl ( ) )
        self.write ( fp.read ( ) , '' )
        self.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def _nlist ( n , m ) :
        for i in range ( m ) :
            a.append ( ni ( ) )
    def _solve ( ) :
        n = ni ( )
        p = [ ]
        for i in range ( 1 , n ) :
            p.append ( ni ( ) )
        return p
    def _ntr ( * o ) :
        if self.fp != sys.stdin :
            print ( _repr ( o ) )
    for i in range ( n - 1 , - 1 , - 1 ) :
        e = [ 0 , 0 , 0 , i ]
        e [ v [ i ] ] += 1
        q = qa [ i ]
        qp = qa [ p [ i ] ]
        while not q and f ( q [ - 1 ] , e ) < 0 :
            f = q.pop ( )
            e [ 2 ] += f [ 2 ] + f [ 0 ] * e [ 1 ]
            e [ 0 ] += f [ 0 ]
            e [ 1 ] += f [ 1 ]
        q.append ( e )
        if i > 0 :
            if len ( q ) > len ( qa [ p [ i ] ] ) :
                qa [ i ] = qp
                qa [ p [ i ] ] = q
    
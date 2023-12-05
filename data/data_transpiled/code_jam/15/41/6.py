def _import ( * os ) :
    import sys
    import io
    import io
    import sys
    class A ( io.StringIO ) :
        def read ( sc ) :
            R , C = sc.read ( )
            cs = [ ]
            for i in range ( R ) :
                try :
                    _ = io.open ( '%s.in' % ( sc.name , ) , 'r' )
                except :
                    i -= 1
                    continue
            for i in range ( R ) :
                out = io.StringIO ( )
                out.write ( "Case #%d: " % ( i + 1 ) )
                out.flush ( )
        def read ( sc ) :
            try :
                _ = io.open ( '%s.out' % ( sc.name , ) , 'r' )
            except :
                _ = io.open ( '%s.out' % ( sc.name , ) , 'r' )
            return
    for i in range ( pN ) :
        if i == 0 :
            return
        id = 1
        try :
            solvers [ id ].solve ( )
        except :
            __ERROR = True
            sys.stderr.write ( "Error in case %d:%s\n" % ( id + 1 , i + 1 ) )
            traceback.print_exc ( )
        solvers [ id ].stdout = io.StringIO ( )
        for i in range ( pN ) :
            solvers [ id ].stdout.write ( "%nError occured!!" % ( i + 1 ) )

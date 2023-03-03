def _import ( ) :
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    class A ( object ) :
        def solve ( self ) :
            self.n = 1
            self.a = [ ]
            self.solve ( )
            self.game = [ [ 'P' , 'R' , 'S' ] ]
        def run ( self ) :
            if self.n_threads > 1 :
                executor = multiprocessing.Pool ( processes = 4 )
                @ asyncio.coroutine
                def outputs ( ) :
                    for t in range ( self.n ) :
                        self.out.write ( self.callables [ t ] )
                for t in range ( self.n ) :
                    self.out.flush ( )
                    sys.stderr.flush ( )
                    sys.exit ( 1 )
                self.out.close ( )
        else :
            for t in range ( self.n ) :
                self.out.write ( self.callables [ t ] ( ) )
    for t in chain ( 1 , 2 ) :
        for s in game [ t - 1 ] :
            b = [ ]
            for c in s :
                b.append ( 'PRS'.index ( c ) )
            if all ( b ) :
                return s
    return 'IMPOSSIBLE'

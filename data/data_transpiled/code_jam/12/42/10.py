def _import ( ) :
    import sys
    import os
    import sys
    class B ( object ) :
        def read ( self ) :
            N , W , L = self._caseid
            return self._caseid
        def write ( self , * os ) :
            sys.stderr.write ( self.__doc__ + "\n" )
            self._caseid = 1
            return self._caseid
        def flush ( self ) :
            sys.stderr.flush ( )
    def _main ( args ) :
        with open ( args.args [ 0 ] if args.args else ( ".stdin" , "r" ) ) as f :
            return B ( f.read ( ) )
    def solve ( ) :
        es = [ Entry ( i , r ) for i in range ( N ) ]
        sort ( es )
        inv = [ e.r for e in es ]
        for i in range ( N ) :
            inv [ i ] = i
        xs , ys = [ ] , [ ]
        dir = 1
        x = 0
        for i in range ( N ) :
            y = 0
            for j in range ( i ) :
                if max ( xs [ j ] - rs [ j ] , x - rs [ i ] ) < min ( xs [ j ] + rs [ j ] , x + rs [ i ] ) :
                    y = max ( y , ys [ j ] + rs [ j ] + rs [ i ] )
                if y > L :
                    debug ( "orz" , i , x )
                    raise None
                xs.append ( x )
                ys.append ( y )
                if i + 1 < N :
                    x2 = x + dir * ( rs [ i ] + rs [ i + 1 ] )
                    if 0 <= x2 <= W :
                        x = x2
                    else :
                        if x2 < 0 :
                            x = 0
                            dir = 1
                        else :
                            x = W
                            dir = - 1
        for i in range ( N ) :
            if i > 0 :
                print ( " " , end = '' )
            print ( xs [ inv [ i ] ] , end = '' )
            print ( ys [ inv [ i ] ] , end = ''
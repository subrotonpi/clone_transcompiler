def import _sys
class A ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        for id in range ( 1 , n + 1 ) :
            s = int ( sc.readline ( ) )
            engines = [ ]
            for i in range ( s ) :
                engines.append ( sc.readline ( ) )
            q = int ( sc.readline ( ) )
            queries = [ ]
            for i in range ( q ) :
                queries.append ( sc.readline ( ) )
            table = [ [ ] for _ in range ( q + 1 ) ]
            for i in range ( q ) :
                [ i ] = [ min ( [ i ] + ( i == 0 ) ) for i in range ( s ) ]
            for i in range ( q ) :
                for j in range ( s ) :
                    if table [ i ] [ j ] < int ( i ) :
                        for k in range ( s ) :
                            if not queries [ i ] in engines :
                                table [ i + 1 ] [ k ] = min ( [ i , j ] + ( j == k ) , table [ i + 1 ] [ k ] )
        res = sum ( [ i for i in range ( s ) ] )
        for j in range ( s ) :
            res = min ( [ i for i in range ( q ) ] )
        if res == int ( i ) :
            raise RuntimeError
        print ( "Case #%d: %d" % ( id , res ) )

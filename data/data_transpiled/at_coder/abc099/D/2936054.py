def main ( ) :
    N = ni ( )
    C = ni ( )
    D = ntable ( C , C )
    c = ntable ( N , N )
    dp = [ [ ] for i in range ( C ) ]
    def ntable ( n , m ) :
        table = [ [ ] for i in range ( m ) ]
        for i in range ( n ) :
            table.append ( [ i , i ] )
        return table
    def nlist ( n , m ) :
        for i in range ( m ) :
            table [ i ] [ ( x + y ) % 3 ] += D [ c [ x ] [ y ] - 1 ] [ i ]
        return table
    min = sum ( [ n for i in range ( C ) ] )
    for i in range ( C ) :
        for j in range ( C ) :
            if i == j :
                continue
            for k in range ( C ) :
                if i == k or j == k :
                    continue
                now = dp [ i ] [ 0 ] + dp [ j ] [ 1 ] + dp [ k ] [ 2 ]
                min = min ( now , min )
    print ( min )
    def main ( ) :
        with threading.Thread ( None , target = main ) as daemon :
            start = time.time ( )
            debug = sys.argv [ 1 ] if debug else None
            if debug :
                with _open ( _sys.argv [ 1 ] , 'r' ) as f :
                    exec ( f.read ( ) , { '__file__' : f } )
            return daemon.run ( )
        daemon.run ( )
        daemon.run ( )
        daemon.run ( )
    def nd ( ) :
        return float ( next ( sys.argv ) )
    def nl ( ) :
        return long ( next ( sys.argv ) )
    def ntable ( n , m ) :
        return [ ]
    def ntable ( n , n ) :
        return [ ]
    def ntable ( n , m ) :
        return [ ]
    def ntable ( n , n ) :
        return [ ]
    def nlist ( n , m ) :
        return [ ]
        
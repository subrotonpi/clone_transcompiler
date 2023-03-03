def main ( ) :
    n = ni ( )
    mod = 1000000000 + 7
    dp = [ [ ] for i in range ( n + 1 ) ]
    def tr ( * o ) :
        if not o or o [ 0 ] :
            print ( _np.fromstring ( o ) )
    def ntable ( n , m ) :
        for i in range ( m ) :
            for j in range ( 1 , 4 ) :
                table [ i ] [ j ] = ni ( )
        return table
    def tr ( * o ) :
        if o != sys.stdin :
            print ( _np.fromstring ( o ) )
    def na ( n ) :
        for i in range ( n ) :
            for j in range ( 1 , 4 ) :
                if check ( s , t , u , k ) :
                    dp [ i + 1 ] [ t ] [ u , k ] += dp [ i ] [ s ] [ t ] [ u ]
                    dp [ i + 1 ] [ t ] [ u , k ] %= mod
        return np.asarray ( dp )
    def check ( s , t , u , k ) :
        if t == 1 and u == 2 and k == 3 or t == 1 and u == 3 and k == 2 or t == 2 and u == 3 :
            return False
        if s == 1 and t == 2 and k == 3 or s == 1 and u == 3 :
            return False
        return True
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' , encoding = 'utf-8' ) as f :
            start = time.time ( )
            debug = sys.argv [ 1 ] if debug else None
            if debug :
                with open ( sys.argv [ 1 ] , 'r' , encoding = 'utf-8' ) as f :
                    f.write ( _np.fromstring ( f.read ( ) , encoding = 'utf-8' ) )
        return np.asarray ( np.fromstring ( f.read ( ) , encoding = 'utf-8' ) )
    return tr ( * o )

def Main ( ) :
    n = ni ( )
    p = ntable ( n , 2 )
    g = 0
    for q in p :
        g ^= grundy ( q [ 0 ] , q [ 1 ] )
    print ( g == 0 and "Aoki" or "Takahashi" )
    def grundy ( a , k ) :
        if a < k :
            return 0
        if a % k == 0 :
            return a // k + 1
        return grundy ( a - max ( ( a % k ) / diff , 1 ) * diff , k )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "r" ) as f :
            start = time.time ( )
            debug = os.environ.get ( "DEBUG" )
            if debug :
                with _open ( _open ( _open ( f ) , "r" ) , "r" , encoding = "utf-8" ) as f :
                    f.write ( "%.6f\n" % ( f.read ( ) ) )
            f.seek ( 0 )
            solve ( )
            f.flush ( )
            tr ( ( time.time ( ) - start ) + "ms" )
    def read ( ) :
        with open ( sys.argv [ 1 ] , "r" ) as f :
            for line in f :
                a = [ ni ( ) for i in line.split ( ) ]
        return a
    def nd ( ) :
        return float ( next ( ) )
    def nl ( ) :
        return long ( next ( ) )
    def na ( n ) :
        a = [ nl ( ) for i in range ( n ) ]
        return a
    def ntable ( n , m ) :
        g ^= grundy ( n , m )
    return ntable ( n , m )

def main ( ) :
    global ni
    k = ni ( )
    if k == 1 :
        print ( 1 )
        print ( 1 )
        return
    n = ( k + 3 ) // 4 * 2
    ret = [ ]
    def ntable ( n , m ) :
        for i in range ( n ) :
            ret.append ( [ ni ( ) if i % 2 == 0 else n ] + [ ni ( ) if j % 2 == 0 else n ] )
    def tr ( * x ) :
        if x != sys.stdin :
            print ( _repr ( x ) )
    def nlist ( n , m ) :
        for i in range ( m ) :
            for j in range ( n ) :
                if ret [ i ] [ j ] >= k :
                    ret [ i ] [ j ] = ( ret [ i ] [ j ] - n ) % k
        print ( n )
        for i in range ( n ) :
            for j in range ( n ) :
                print ( ( ret [ i ] [ j ] + 1 ) , end = ' ' )
        print ( )
    def main ( ) :
        with threading.Lock ( None , lambda : sys.stdin.readline ( ) ) :
            start = time.time ( )
            debug = sys.argv [ 1 ] if debug else None
            if debug :
                with _open ( _sys.argv [ 1 ] , 'r' ) as f :
                    return f.read ( )
        return sys.stdin.readline ( )
    def nd ( ) :
        return float ( next ( sys.stdin ) )
    def nl ( ) :
        return int ( next ( sys.stdin ) )
    def nl ( ) :
        return int ( next ( sys.stdin ) )
    def nlist ( n , m ) :
        for i in range ( m ) :
            ret [ i ] = ntable ( n , m )
    return nlist ( n , n )
def tr ( * x ) :
    return int ( next ( sys.stdin ) )
def nlist ( n , m ) :
    return nlist ( n , m )
return tr ( * x )
